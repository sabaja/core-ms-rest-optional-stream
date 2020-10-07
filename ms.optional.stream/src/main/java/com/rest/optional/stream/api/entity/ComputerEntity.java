package com.rest.optional.stream.api.entity;

import com.rest.optional.stream.api.constants.ComputerType;
import com.rest.optional.stream.api.constants.State;
import com.rest.optional.stream.util.repository.converter.ComputerTypeConverter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity(name = "computerEntity")
@Table(name = "T_PAD_COMPUTER")
@SequenceGenerator(name = "computer_sequence", sequenceName = "computer_sequence", allocationSize = 1)
@SQLDelete(sql = "UPDATE computerEntity SET STATE = 'DELETED' WHERE ID = ?", check = ResultCheckStyle.COUNT)
//@Where(clause = "STATE <> 'DELETED'") per escludere i deleted
@NamedQuery(name = "computerEntity.findById", query = "SELECT c FROM computerEntity c WHERE c.id = :id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ComputerEntity extends VersionEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "computer_sequence")
    @Column(name = "ID", updatable = false, nullable = false)
    private BigInteger id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "OS_ID")
    private OsEntity os;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "SOUND_CARD_ID")
    private SoundCardEntity soundCard;

    @Convert(converter = ComputerTypeConverter.class)
    private ComputerType computerType;

    @Column(name = "CREATED_AT")
    private LocalDateTime createAt;

    @PreRemove
    public void deleteComputer() {
        super.setState(State.DELETED);
    }
}
