package com.rest.optional.stream.api.entity;

import com.rest.optional.stream.api.constants.State;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class VersionEntity {

    @Column(name = "STATE")
    @Enumerated(value = EnumType.STRING)
    private State state;

    @Column(name = "STATE_DATE_TIME")
    private LocalDateTime stateDate;

    @PrePersist
    protected void onCreate() {
        if (stateDate == null) {
            stateDate = LocalDateTime.now();
        }
        if (state == null) {
            state = State.INACTIVE;
        }
    }

    @PreUpdate
    protected void onUpdateDate() {
        stateDate = LocalDateTime.now();
    }
}
