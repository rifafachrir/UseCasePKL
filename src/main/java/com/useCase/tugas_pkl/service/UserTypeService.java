package com.useCase.tugas_pkl.service;

import com.useCase.tugas_pkl.dto.usertype.UserTypeDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserTypeService {
    public void createUserType(UserTypeDTO dto);
    
    public List<UserTypeDTO> findAllUserType(String name);

}
