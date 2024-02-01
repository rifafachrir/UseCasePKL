package com.useCase.tugas_pkl.service.Implement;

import com.useCase.tugas_pkl.domain.Operation;
import com.useCase.tugas_pkl.domain.User;
import com.useCase.tugas_pkl.domain.UserType;
import com.useCase.tugas_pkl.dto.user.UserConfigViewDTO;
import com.useCase.tugas_pkl.repository.UserRepository;
import com.useCase.tugas_pkl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public List<UserConfigViewDTO> showAllUser() {
        List<User> users = userRepository.findAll();
        List<UserConfigViewDTO> userConfigViewDTOList = new ArrayList<>();
        for (User user : users){
                UserConfigViewDTO dto = new UserConfigViewDTO();
                dto.setId(user.getId());
                dto.setUserId(user.getUserId());
                dto.setFirstName(user.getFirstName());
                dto.setLastName(user.getLastName());
                dto.setUsername(user.getUsername());
                dto.setEmail(user.getEmail());
                dto.setUserTypeId(user.getType().getId());
                dto.setUserType(user.getType().getName());
                dto.setUserGroupId(user.getUserGroup().getId());
                dto.setUserGroup(user.getUserGroup().getName());
                dto.setRoleId(user.getRole().getId());
                dto.setRole(user.getRole().getName());
                dto.setInstitutionId(user.getInstitution().getId());
                dto.setInstitution(user.getInstitution().getName());

                userConfigViewDTOList.add(dto);

        }

        return userConfigViewDTOList;

    }
}
