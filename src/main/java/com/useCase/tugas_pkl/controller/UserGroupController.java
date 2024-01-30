package com.useCase.tugas_pkl.controller;


import com.useCase.tugas_pkl.dto.usergroup.UserGroupResponseDTO;
import com.useCase.tugas_pkl.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/usergroup/")
public class UserGroupController {
    @Autowired
    UserGroupService userGroupService;

    @PostMapping("create")
    public ResponseEntity<Void> createNewUserGroup(@RequestBody UserGroupResponseDTO dto) throws URISyntaxException {
        userGroupService.createUserGroup(dto);
        return ResponseEntity.created(new URI("/usergroup/create")).build();
    }

    @GetMapping("{id}")
    public ResponseEntity<UserGroupResponseDTO> findUserGroup(@PathVariable("id") Long userGroupId){
        UserGroupResponseDTO dto = userGroupService.findUserGroupId(userGroupId);
        return ResponseEntity.ok(dto);
    }

}
