package com.brunozisman.systemcontrol.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class AnnualLeaveId implements Serializable{
        private long annualLeaveId;
        private long movementId;
        private long userId;
    }

    @EmbeddedId
    private AnnualLeaveId id;
    private LocalDateTime dateWorked;
    private BigDecimal hoursWorkedAmount;
    private BigDecimal hoursWorkedBalance;
}
