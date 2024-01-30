package com.useCase.tugas_pkl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "operation")
public class Operation {
    @Id
    @SequenceGenerator(name = "operation_seq", sequenceName = "operation_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "operation_seq")
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "operations")
    private Set<Role> roles;
}
