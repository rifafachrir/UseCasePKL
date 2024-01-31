package com.useCase.tugas_pkl.service.Implement;

import com.useCase.tugas_pkl.domain.Operation;
import com.useCase.tugas_pkl.domain.Role;
import com.useCase.tugas_pkl.dto.role.RoleCreateDTO;
import com.useCase.tugas_pkl.dto.role.RoleDetailDTO;
import com.useCase.tugas_pkl.dto.role.RoleResponDTO;
import com.useCase.tugas_pkl.exception.ResourceNotFoundException;
import com.useCase.tugas_pkl.repository.RoleRepository;
import com.useCase.tugas_pkl.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;


    @Override
    public void createNewRole(RoleCreateDTO dto) {
        Role role = new Role();
        role.setName(dto.getName());

        roleRepository.save(role);
    }

    @Override
    public List<RoleResponDTO> showAllRole() {

//        roleName = ObjectUtils.isEmpty(roleName)? "%":"%"+roleName+"%";

        List<Role> roleResponses = roleRepository.findAll();
        return roleResponses.stream().map((r)->{
            RoleResponDTO dto = new RoleResponDTO();
            dto.setId(r.getId());
            dto.setName(r.getName());

            return dto;

        }).collect(Collectors.toList());
    }

    @Override
    public List<RoleDetailDTO> getAllRoleWithOperation() {
        List<Role> roles = roleRepository.findAll();
        List<RoleDetailDTO> roleDetailDTOList = new ArrayList<>();

        for (Role role : roles){
            for (Operation operation : role.getOperations()){
                RoleDetailDTO dto = new RoleDetailDTO();
                dto.setId(role.getId());
                dto.setName(role.getName());
                dto.setOperationId(operation.getId());
                dto.setOperationName(operation.getName());
                roleDetailDTOList.add(dto);
            }
        }
        return roleDetailDTOList;
    }

//    @Override
//    public RoleDetailDTO findRoleDetail(Long roleId) {
//        Role role = roleRepository.findById(roleId)
//                .orElseThrow(()->new ResourceNotFoundException("ROLE ID NOT FOUND"));
//
//        RoleDetailDTO dto = new RoleDetailDTO();
//        dto.setId(role.getId());
//        dto.setName(role.getName());
//        role.getOperations().stream().map((o)->{
//            dto.setOperationId(o.getId());
//            dto.setOperationName(o.getName());
//
//            return dto;
//        }).collect(Collectors.toList());
//
//
//        return dto;
//    }
}