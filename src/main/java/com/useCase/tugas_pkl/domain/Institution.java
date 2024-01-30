package com.useCase.tugas_pkl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "institution")
public class Institution {
    @Id
    @SequenceGenerator(name = "institution_seq", sequenceName = "institution_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "institution_seq")
    private Long id;

    private String name;
}
