package com.useCase.tugas_pkl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "role")
public class Role {
    @Id
    @SequenceGenerator(name = "role_seq", sequenceName = "role_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq")
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "role_operation",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "operation_id"))
    private Set<Operation> operations;

//    public void addOperation(Operation operation) {
//        operations.add(operation);
//        operation.getRoles().add(this);
//    }


}
