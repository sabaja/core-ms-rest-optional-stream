package com.rest.optional.stream.api.entity;

import com.rest.optional.stream.api.constants.ComputerType;
import com.rest.optional.stream.api.constants.State;
import com.rest.optional.stream.util.repository.converter.ComputerTypeConverter;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity(name = "computerEntity")
@Table(schema = "REST", name = "T_PAD_COMPUTER")
//@SequenceGenerator(name = "computer_sequence", sequenceName = "computer_sequence", allocationSize = 1)
//@SQLDelete(sql = "UPDATE computerEntity SET STATE = 'DELETED' WHERE ID = ?", check = ResultCheckStyle.COUNT)
//@Where(clause = "STATE <> 'DELETED'") per escludere i deleted
@NamedQuery(name = "computerEntity.findById", query = "SELECT c FROM computerEntity c WHERE c.id = :id")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ComputerEntity extends VersionEntity implements Serializable {

    public static final String FIELD_ID = "id";
    public static final String CREATED_AT = "createAt";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private BigInteger id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "OS_ID")
    private OsEntity os;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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
