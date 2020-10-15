package com.rest.optional.stream.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity(name = "usbEntity")
@Table(schema = "REST", name = "T_PAD_USB")
//@SequenceGenerator(name = "usb_sequence", sequenceName = "usb_sequence", allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsbEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private BigInteger id;

    @Column(name = "VERSION")
    private String version;

    @OneToOne(mappedBy = "usb")
    private SoundCardEntity soundCardEntity;
}
