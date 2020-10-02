package com.rest.optional.stream.api.entity;

import com.rest.optional.stream.api.constants.ComputerType;
import com.rest.optional.stream.util.repository.converter.ComputerTypeConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity(name = "computerEntity")
@Table(name = "T_PAD_COMPUTER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComputerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private BigInteger id;

    @OneToOne
    @JoinColumn(name = "OS_ID")
    private OsEntity os;

    @OneToOne
    @JoinColumn(name = "SOUND_CARD_ID")
    private SoundCardEntity soundCard;

    @Convert(converter = ComputerTypeConverter.class)
    private ComputerType computerType;

    @Column(name = "CREATED_AT")
    private LocalDateTime createAt;
}
