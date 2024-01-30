package com.useCase.tugas_pkl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "user_group")
public class UserGroup {
    @Id
    @SequenceGenerator(name = "userGroup_seq", sequenceName = "userGroup_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userGroup_seq")
    private Long id;

    private String name;
}
