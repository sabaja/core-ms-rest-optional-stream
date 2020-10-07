package com.rest.optional.stream.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Entity(name = "soundCardEntity")
@Table(name = "T_PAD_SOUND_CARD")
@SequenceGenerator(name = "sound_card_sequence", sequenceName = "sound_card_sequence", allocationSize = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoundCardEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sound_card_sequence")
    @Column(name = "ID", updatable = false, nullable = false)
    private BigInteger id;

    @Column(name = "VERSION")
    private String version;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "USB_ID")
    private UsbEntity usb;

}
