package com.useCase.tugas_pkl.dto.role;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoleDetailDTO {

    private Long id;
    private String name;
    private Long operationId;
    private String operationName;

}
