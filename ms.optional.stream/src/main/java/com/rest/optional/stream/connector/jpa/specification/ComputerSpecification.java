package com.rest.optional.stream.connector.jpa.specification;

import com.rest.optional.stream.api.entity.ComputerEntity;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigInteger;
import java.time.LocalDateTime;

import static com.rest.optional.stream.api.entity.ComputerEntity.CREATED_AT;
import static com.rest.optional.stream.api.entity.ComputerEntity.FIELD_ID;

public class ComputerSpecification {

    private ComputerSpecification() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static Specification<ComputerEntity> withIdComputerEqualsTo(BigInteger id) {
        return id != null ? (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get(FIELD_ID), id) : null;
    }

    public static Specification<ComputerEntity> withCreateAtEqualsTo(LocalDateTime createdAt) {
        return createdAt != null ? (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get(CREATED_AT), createdAt) : null;
    }

    public static Specification<ComputerEntity> withCreateAtGreaterThen(LocalDateTime createdAt) {
        return createdAt != null ? (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get(CREATED_AT), createdAt) : null;
    }

    public static Specification<ComputerEntity> withCreateAtGreaterOrEqualsThen(LocalDateTime createdAt) {
        return createdAt != null ? (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get(CREATED_AT), createdAt) : null;
    }

    public static Specification<ComputerEntity> withCreateAtLessThen(LocalDateTime createdAt) {
        return createdAt != null ? (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.lessThan(root.get(CREATED_AT), createdAt) : null;
    }

    public static Specification<ComputerEntity> withCreateAtLessOrEqualsThen(LocalDateTime createdAt) {
        return createdAt != null ? (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get(CREATED_AT), createdAt) : null;
    }
}

