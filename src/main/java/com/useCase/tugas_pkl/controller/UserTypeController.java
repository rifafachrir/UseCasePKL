package com.useCase.tugas_pkl.controller;

import com.useCase.tugas_pkl.dto.usertype.UserTypeDTO;
import com.useCase.tugas_pkl.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

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

    @GetMapping("/{id}")
    public ResponseEntity<UserTypeDTO> findUserType(@PathVariable("id") Long userTypeId){
        UserTypeDTO dto = userTypeService.findUserType(userTypeId);
        return ResponseEntity.ok(dto);
    }

}
