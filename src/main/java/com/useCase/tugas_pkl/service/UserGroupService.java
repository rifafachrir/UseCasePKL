package com.useCase.tugas_pkl.service;

import com.useCase.tugas_pkl.dto.usergroup.UserGroupResponseDTO;

public interface UserGroupService {
    public void createUserGroup(UserGroupResponseDTO dto);

    public UserGroupResponseDTO findUserGroupId(Long userGroupId);
}
