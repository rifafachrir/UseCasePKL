package com.useCase.tugas_pkl.dto.useraudit;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserAuditResponsDTO {
    private Long id;
    private String captureDate;
    private Long timeStamp;
    private String timeTaken;
    private int status;
    private String method;
    private String uri;
    private String host;
    private String userAgent;
    private String remoteAddress;
    private Long userId;


}
