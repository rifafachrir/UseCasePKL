package com.useCase.tugas_pkl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "user_audit")
public class UserAudit {
    @Id
    @SequenceGenerator(name = "userAudit_seq", sequenceName = "userAudit_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userAudit_seq")
    @Column(name = "id")
    private Long auditId;
    private String captureDate;
    private Long timestamp;
    private String timeTaken;
    private int status;
    private String method;
    private String uri;
    private String host;
    private String userAgent;
    private String remoteAddress;
    @ManyToOne
    @JoinColumn(name = "users", nullable = false)
    private User id;
}
