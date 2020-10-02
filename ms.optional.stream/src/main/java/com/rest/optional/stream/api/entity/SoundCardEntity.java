package com.rest.optional.stream.api.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity(name = "soundCardEntity")
@Table(name = "T_PAD_SOUND_CARD")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoundCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private BigInteger id;

    @Column(name = "VERSION")
    private String version;

    @OneToOne
    @JoinColumn(name = "USB_ID")
    private UsbEntity usb;

}
