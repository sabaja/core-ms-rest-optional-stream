package com.rest.optional.stream.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity(name = "osEntity")
@Table(name = "T_PAD_OS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private BigInteger id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "VERSION")
    private String version;

    @Column(name = "CREATED_AT")
    private LocalDateTime createAt;

    @Column(name = "END_DATE")
    private LocalDateTime endDate;
}
