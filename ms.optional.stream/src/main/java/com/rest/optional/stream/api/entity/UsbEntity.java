package com.rest.optional.stream.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity(name = "usbEntity")
@Table(name = "T_PAD_USB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsbEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private BigInteger id;

    @Column(name = "VERSION")
    private String version;
}
