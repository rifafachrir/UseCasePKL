package com.useCase.tugas_pkl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "user_config")
public class User {
    @Id
    @SequenceGenerator(name = "userConfig_seq", sequenceName = "userConfig_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userConfig_seq" )
//    @OneToMany(mappedBy = "user_config")
    private Long id;
    @Column(name = "userId")
    private Long userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private Date lastLoginDate;
    private boolean isActive;
    private boolean isNotLocked = false;
    private boolean resetPassword = false;
    @ManyToOne
    @JoinColumn(name = "type")
    private UserType type;
    @ManyToOne
    @JoinColumn(name = "user_group")
    private UserGroup userGroup;
    @ManyToOne
    @JoinColumn(name = "role")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "institution")
    private Institution institution;

}
