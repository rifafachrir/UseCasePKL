package com.useCase.tugas_pkl.controller;

import com.useCase.tugas_pkl.dto.operation.OperationCreateRequestDTO;
import com.useCase.tugas_pkl.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@Controller
@RequestMapping("/operation")
public class OperationController {
    @Autowired
    OperationService operationService;

    @PostMapping("/create")
    public ResponseEntity<Void> createANewOperation(@RequestBody OperationCreateRequestDTO dto) throws URISyntaxException{
        operationService.createNewOperation(dto);
        return ResponseEntity.created(new URI("/operation/create")).build();
    }


}
