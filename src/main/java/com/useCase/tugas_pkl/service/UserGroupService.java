package com.useCase.tugas_pkl.service;

import com.useCase.tugas_pkl.dto.usergroup.UserGroupResponseDTO;

import java.util.List;

public interface UserGroupService {
    public void createUserGroup(UserGroupResponseDTO dto);

    public UserGroupResponseDTO findUserGroupId(Long userGroupId);

    public List<UserGroupResponseDTO> findAllUserGroup(String name);
}
