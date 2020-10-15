package com.rest.optional.stream.connector.jpa.repository;

import com.google.common.collect.Iterables;
import com.rest.optional.stream.api.constants.ComputerType;
import com.rest.optional.stream.api.constants.State;
import com.rest.optional.stream.api.entity.ComputerEntity;
import com.rest.optional.stream.api.entity.OsEntity;
import com.rest.optional.stream.api.entity.SoundCardEntity;
import com.rest.optional.stream.api.entity.UsbEntity;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

import static com.google.common.collect.Iterables.getFirst;
import static com.google.common.collect.Iterables.size;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ComputerBinRepositoryTest {
    //private EnityManager enityManager;

    @Autowired
    ComputerRepository repository;

    @Test
    @SneakyThrows
//   @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {"classpath:sql/test_schema.sql", "classpath:sql/test_data.sql"})
    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {"classpath:sql/test_schema.sql", "classpath:sql/test_delete_data.sql"})
    public void repositorySaveAndFind_shouldExecute() {
        final ComputerEntity computerEntity = mockComputerEntities();
        final ComputerEntity entity = repository.save(computerEntity);

        final BigInteger id = entity.getId();
        final State state = entity.getState();
        assertNotNull(entity);
        assertNotNull(id);
        assertEquals(BigInteger.ONE, id);
        assertNotNull(state);
        assertEquals(State.INACTIVE, state);

        final List<ComputerEntity> allInactive = repository.findAllInactive();
        assertFalse(Iterables.isEmpty(allInactive));

        final List<ComputerEntity> allWithHistory = repository.findAllWithHistory();
        assertFalse(Iterables.isEmpty(allWithHistory));
        final ComputerEntity entity1 = getFirst(allWithHistory, null);
        assertNotNull(entity1);
        assertNotNull(entity1.getId());
        assertNotNull(entity1.getState());

        final List<ComputerEntity> allActives = repository.findAllActive();
        assertTrue(Iterables.isEmpty(allActives));

        final List<ComputerEntity> allDeleted = repository.findAllDeleted();
        assertTrue(Iterables.isEmpty(allDeleted));
    }

    @Test
    @SneakyThrows
    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = {"classpath:sql/test_schema.sql", "classpath:sql/test_data.sql"})
    public void repositorySoftDelete_shouldExecute() {
        final List<ComputerEntity> allActiveComputers = repository.findAllActive();
        assertFalse(Iterables.isEmpty(allActiveComputers));
        final int activeComputerSize = size(allActiveComputers);

        allActiveComputers.forEach(pc -> {
            repository.softDelete(pc.getId());
            repository.flush();
        });

        final List<ComputerEntity> allDeletedComputers = repository.findAllDeleted();
        assertFalse(Iterables.isEmpty(allDeletedComputers));
        final int deletedComputerSize = size(allDeletedComputers);
        assertTrue(deletedComputerSize > activeComputerSize);

        allDeletedComputers.forEach(pc -> {
            assertEquals(State.DELETED, pc.getState());
        });
    }

    private ComputerEntity mockComputerEntities() {
        ComputerEntity computerEntity = new ComputerEntity();
        computerEntity.setOs(mockOs());
        computerEntity.setSoundCard(mockSoundCard());
        computerEntity.setComputerType(ComputerType.PERSONAL_COMPUTER);
        computerEntity.setCreateAt(LocalDateTime.now());
        computerEntity.setStateDate(LocalDateTime.now());
        return computerEntity;
    }

    private SoundCardEntity mockSoundCard() {
        final SoundCardEntity soundCardEntity = new SoundCardEntity();
        soundCardEntity.setVersion("3.1.0");
        soundCardEntity.setUsb(mockUsb());

        return soundCardEntity;
    }

    private UsbEntity mockUsb() {
        final UsbEntity usbEntity = new UsbEntity();
        usbEntity.setVersion("1.1.1");

        return usbEntity;
    }

    private OsEntity mockOs() {
        final OsEntity osEntity = new OsEntity();
        osEntity.setName("Linux");
        osEntity.setVersion("1.0.0");
        osEntity.setCreateAt(LocalDateTime.now());
        osEntity.setEndDate(LocalDateTime.now());
        return osEntity;
    }
}