package com.test.notes.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String body;
    @Column(nullable = false)
    private Long personId;
}
