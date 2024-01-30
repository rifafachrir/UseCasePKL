package com.useCase.tugas_pkl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "user_type")
public class UserType {
    @Id
    @SequenceGenerator(name = "userType_seq", sequenceName = "userType_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userType_seq")
    private long id;
    private String name;

}
