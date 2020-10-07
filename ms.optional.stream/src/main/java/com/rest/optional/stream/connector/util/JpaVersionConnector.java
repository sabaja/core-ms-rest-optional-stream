package com.rest.optional.stream.connector.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface JpaVersionConnector<T, ID extends Serializable> extends JpaRepository<T, ID> {
    @Query("select t from #{#entityName} t")
    @Transactional(readOnly = true)
    List<T> findAllWithHistory();

    @Query("select t from #{#entityName} t where t.state='ACTIVE'")
    @Transactional(readOnly = true)
    List<T> findAllActive();

    @Query("select t from #{#entityName} t where t.state='INACTIVE'")
    @Transactional(readOnly = true)
    List<T> findAllInactive();

    @Query("select t from #{#entityName} t where t.state='DELETED'")
    @Transactional(readOnly = true)
    List<T> findAllDeleted();

    @Query("update #{#entityName} t set t.state='DELETED' where t.id=?1")
    @Transactional
    @Modifying
    void softDelete(String id);
}
