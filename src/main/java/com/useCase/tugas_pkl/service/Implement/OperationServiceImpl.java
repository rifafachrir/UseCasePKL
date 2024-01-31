package com.useCase.tugas_pkl.service.Implement;

import com.useCase.tugas_pkl.domain.Operation;
import com.useCase.tugas_pkl.domain.Role;
import com.useCase.tugas_pkl.dto.operation.OperationCreateRequestDTO;
import com.useCase.tugas_pkl.exception.ResourceNotFoundException;
import com.useCase.tugas_pkl.repository.OperationRepository;
import com.useCase.tugas_pkl.repository.RoleRepository;
import com.useCase.tugas_pkl.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    OperationRepository operationRepository;
    @Autowired
    RoleRepository roleRepository;


    @Override
    public void createNewOperation(OperationCreateRequestDTO dto) {
        Role role = roleRepository.findById(dto.getRoleId())
                .orElseThrow(()-> new ResourceNotFoundException("ROLE ID NOT FOUND"));
        Operation operation = new Operation();
        role.getOperations().add(operation);
        Set<Role> roles = Set.of(role);
        operation.setName(dto.getName());
        operation.setRoles(roles);

        operationRepository.save(operation);
    }
}
