package com.useCase.tugas_pkl.service.Implement;

import com.useCase.tugas_pkl.domain.UserType;
import com.useCase.tugas_pkl.dto.usertype.UserTypeDTO;
import com.useCase.tugas_pkl.exception.ResourceNotFoundException;
import com.useCase.tugas_pkl.repository.UserTypeRepository;
import com.useCase.tugas_pkl.service.UserService;
import com.useCase.tugas_pkl.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    UserTypeRepository userTypeRepository;

    @Override
    public void createUserType(UserTypeDTO dto) {

        UserType userType = new UserType();
        userType.setName(dto.getName());

        userTypeRepository.save(userType);
    }

    @Override
    public UserTypeDTO findUserType(Long userTypeId) {
        UserType userType = userTypeRepository.findById(userTypeId)
                .orElseThrow(()-> new ResourceNotFoundException("user Type not found"));

        UserTypeDTO dto = new UserTypeDTO();
        dto.setName(userType.getName());
        dto.setId(userType.getId());
        return dto;
    }


}
