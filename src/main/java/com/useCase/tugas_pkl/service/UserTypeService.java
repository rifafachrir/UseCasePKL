package com.useCase.tugas_pkl.service;

import com.useCase.tugas_pkl.dto.usertype.UserTypeDTO;
import org.springframework.stereotype.Service;


public interface UserTypeService {
    public void createUserType(UserTypeDTO dto);

    public UserTypeDTO findUserType(Long userTypeId);

}
