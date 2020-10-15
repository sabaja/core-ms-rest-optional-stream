package com.rest.optional.stream.service.impl;

import com.rest.optional.stream.api.bin.ComputerBin;
import com.rest.optional.stream.api.constants.State;
import com.rest.optional.stream.api.entity.ComputerEntity;
import com.rest.optional.stream.connector.jpa.repository.ComputerRepository;
import com.rest.optional.stream.service.ComputerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import static java.util.Objects.nonNull;

@Service
@Slf4j
public class ComputerServiceImpl implements ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    private final Consumer<ComputerEntity> deleteComputerEntities = computerEntity -> computerRepository.softDelete(computerEntity.getId());

    @Override
    @Transactional
    public ComputerBin deleteComputer() {
        final List<ComputerEntity> allActiveComputers = computerRepository.findAllActive();
        Map<BigInteger, ComputerEntity> computerEntityMap = null;
        if (CollectionUtils.isNotEmpty(allActiveComputers)) {
            computerEntityMap = new HashMap<>();
            for (ComputerEntity allActiveComputer : allActiveComputers) {
                computerEntityMap.put(allActiveComputer.getId(), allActiveComputer);
                softDelete(allActiveComputer);
            }
        }
        computerRepository.flush();

        final List<ComputerEntity> allDeletedComputers = computerRepository.findAllDeleted();
        log.info("{}", allDeletedComputers);
        restoreStateForComputerEntity(computerEntityMap);

        return null;
    }

    private Map<MutableBoolean, ComputerEntity> restoreStateForComputerEntity(Map<BigInteger, ComputerEntity> computerEntityMap) {
        Map<MutableBoolean, ComputerEntity> restoredMap = new HashMap<>();
        if (computerEntityMap == null) {
            throw new NoSuchElementException("No value present");
        }
        for (BigInteger id : computerEntityMap.keySet()) {
            if (id != null) {
                final ComputerEntity computerEntity = computerRepository.getOne(id);
                restoredMap.putAll(restoreStateForComputerEntity(computerEntity));
            }
        }
        return restoredMap;
    }

    private Map<MutableBoolean, ComputerEntity> restoreStateForComputerEntity(final ComputerEntity computerEntity) {
        Map<MutableBoolean, ComputerEntity> restoredMap = new HashMap<>();
        if (nonNull(computerEntity)) {
            computerEntity.setState(State.ACTIVE);
            computerEntity.setStateDate(LocalDateTime.now());
            restoredMap.put(new MutableBoolean(Boolean.TRUE), computerRepository.saveAndFlush(computerEntity));
            return restoredMap;
        }
        restoredMap.put(new MutableBoolean(Boolean.FALSE), null);
        return (restoredMap);
    }

    private void softDelete(ComputerEntity computerEntity) {
        if (nonNull(computerEntity)) {
            deleteComputerEntities.accept(computerEntity);
        }
    }
}
