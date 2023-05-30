package com.personservice.personservice.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "persons")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;
}
