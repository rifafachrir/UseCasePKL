package com.useCase.tugas_pkl.service;

import com.useCase.tugas_pkl.domain.Operation;
import com.useCase.tugas_pkl.dto.role.RoleCreateDTO;
import com.useCase.tugas_pkl.dto.role.RoleDetailDTO;
import com.useCase.tugas_pkl.dto.role.RoleResponDTO;

import java.util.List;
import java.util.Set;

public interface RoleService {

    public void createNewRole(RoleCreateDTO dto);

    public List<RoleResponDTO> showAllRole();

    public List<RoleDetailDTO> getAllRoleWithOperation();

}
