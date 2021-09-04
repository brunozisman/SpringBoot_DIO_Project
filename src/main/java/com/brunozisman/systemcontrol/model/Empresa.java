package com.brunozisman.systemcontrol.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Empresa {
    @Id
    private long id;
    private String description;
    private String registeredNumber;
    private String address;
    private String neighborhood;
    private String city;
    private String state;
    private String phoneNumber;
}
