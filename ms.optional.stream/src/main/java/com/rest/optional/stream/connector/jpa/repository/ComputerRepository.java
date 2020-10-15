package com.rest.optional.stream.connector.jpa.repository;

import com.rest.optional.stream.api.entity.ComputerEntity;
import com.rest.optional.stream.connector.util.JpaVersionConnector;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigInteger;

@Repository
@Transactional
public interface ComputerRepository extends JpaVersionConnector<ComputerEntity, BigInteger>, JpaSpecificationExecutor<ComputerEntity> {
}
