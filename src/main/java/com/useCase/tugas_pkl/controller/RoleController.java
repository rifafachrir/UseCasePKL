package com.useCase.tugas_pkl.controller;

import com.useCase.tugas_pkl.domain.Operation;
import com.useCase.tugas_pkl.dto.role.RoleCreateDTO;
import com.useCase.tugas_pkl.dto.role.RoleDetailDTO;
import com.useCase.tugas_pkl.dto.role.RoleResponDTO;
import com.useCase.tugas_pkl.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;

@RestController
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/create")
    public ResponseEntity<Void> createANewRole(@RequestBody RoleCreateDTO dto) throws URISyntaxException{
        roleService.createNewRole(dto);
        return ResponseEntity.created(new URI("/role/create")).build();
    }

    @GetMapping("/")
    public ResponseEntity<List<RoleResponDTO>> getAllRole(){
        List<RoleResponDTO> dtos = roleService.showAllRole();
        return ResponseEntity.ok().body(dtos);
    }

    @GetMapping("/show")
    public ResponseEntity<List<RoleDetailDTO>> getAllRolesWithOperations(){
        List<RoleDetailDTO> dtos = roleService.getAllRoleWithOperation();
        return ResponseEntity.ok().body(dtos);
    }

//    @GetMapping("/{id}")
//   public ResponseEntity<Set<Operation>> findAllOperationWithRole(@PathVariable("id") Long roleId){
//        Set<Operation> operationSet = roleService.getOperationById(roleId);
//        return ResponseEntity.ok().body(operationSet);
//   }

}
