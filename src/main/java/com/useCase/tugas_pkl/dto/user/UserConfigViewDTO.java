package com.useCase.tugas_pkl.dto.user;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserConfigViewDTO {
    private Long id;
    private Long userId;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private Long userTypeId;
    private String userType;
    private Long userGroupId;
    private String userGroup;
    private Long roleId;
    private String role;
    private Long institutionId;
    private String institution;
//    buat user_audit
//    private Long operationId;
//    private String operation;

}
