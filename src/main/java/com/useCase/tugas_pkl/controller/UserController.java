package com.useCase.tugas_pkl.controller;

import com.useCase.tugas_pkl.dto.user.UserConfigViewDTO;
import com.useCase.tugas_pkl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<UserConfigViewDTO>> getAllUser (){
        List<UserConfigViewDTO> dtos = userService.showAllUser();
        return ResponseEntity.ok().body(dtos);
    }

}
