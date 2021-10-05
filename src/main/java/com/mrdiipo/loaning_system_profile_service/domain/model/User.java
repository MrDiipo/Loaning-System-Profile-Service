package com.mrdiipo.loaning_system_profile_service.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {

    @Id
    private String username;

    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
    private LocalDate registeredSince;
}
