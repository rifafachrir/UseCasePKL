package com.useCase.tugas_pkl.service.Implement;

import com.useCase.tugas_pkl.domain.Institution;
import com.useCase.tugas_pkl.domain.UserType;
import com.useCase.tugas_pkl.dto.institution.InstitutionResponseDTO;
import com.useCase.tugas_pkl.dto.usertype.UserTypeDTO;
import com.useCase.tugas_pkl.exception.ResourceNotFoundException;
import com.useCase.tugas_pkl.repository.UserTypeRepository;
import com.useCase.tugas_pkl.service.UserService;
import com.useCase.tugas_pkl.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<UserTypeDTO> findAllUserType(String name) {
        name = ObjectUtils.isEmpty(name)?"%":"%"+name+"%";

        List<UserType> userTypeList =  userTypeRepository.findAllByNameLike(name);
        return userTypeList.stream().map((ut)-> {
            UserTypeDTO dtos = new UserTypeDTO();
            dtos.setName(ut.getName());
            dtos.setId(ut.getId());
            return dtos;
        }).collect(Collectors.toList());

    }
}
