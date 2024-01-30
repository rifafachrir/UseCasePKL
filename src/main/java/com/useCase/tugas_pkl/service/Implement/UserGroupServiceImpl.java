package com.useCase.tugas_pkl.service.Implement;

import com.useCase.tugas_pkl.domain.UserGroup;
import com.useCase.tugas_pkl.dto.usergroup.UserGroupResponseDTO;
import com.useCase.tugas_pkl.exception.ResourceNotFoundException;
import com.useCase.tugas_pkl.repository.UserGroupRepository;
import com.useCase.tugas_pkl.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    UserGroupRepository userGroupRepository;

    @Override
    public void createUserGroup(UserGroupResponseDTO dto) {
        UserGroup userGroup = new UserGroup();

        userGroup.setName(dto.getName());

        userGroupRepository.save(userGroup);
    }

    @Override
    public UserGroupResponseDTO findUserGroupId(Long userGroupId){
        UserGroup userGroup = userGroupRepository.findById(userGroupId)
                .orElseThrow(()-> new ResourceNotFoundException("User Group not found"));
        UserGroupResponseDTO dto = new UserGroupResponseDTO();
        dto.setId(userGroup.getId());
        dto.setName(userGroup.getName());

        return dto;
    }
}
