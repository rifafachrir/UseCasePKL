package com.useCase.tugas_pkl.controller;

import com.useCase.tugas_pkl.dto.usertype.UserTypeDTO;
import com.useCase.tugas_pkl.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/userType")
public class UserTypeController {
    @Autowired
    UserTypeService userTypeService;

    @PostMapping("/create")
    public ResponseEntity<Void> createNewUserType(@RequestBody UserTypeDTO dto) throws URISyntaxException{
        userTypeService.createUserType(dto);
        return ResponseEntity.created(new URI("/userType/create")).build();
    }

    @GetMapping("/")
    public ResponseEntity<List<UserTypeDTO>> getAllUserType(@PathVariable(value = "name", required = false) String name){
        List<UserTypeDTO> dtos = userTypeService.findAllUserType(name);
        return ResponseEntity.ok().body(dtos);
    }

}
