package com.useCase.tugas_pkl.controller;

import com.useCase.tugas_pkl.dto.institution.InstitutionCreateRequestDTO;
import com.useCase.tugas_pkl.dto.institution.InstitutionResponseDTO;
import com.useCase.tugas_pkl.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/institution/")
public class InstitutionController {

    @Autowired
    private InstitutionService institutionService;

    @PostMapping("create")
    public ResponseEntity<Void> createANewInstitution(@RequestBody InstitutionCreateRequestDTO dto)throws URISyntaxException {
        institutionService.createNewInstitution(dto);
        return ResponseEntity.created(new URI("/institution/create")).build();
    }

    @GetMapping("{id}")
    public ResponseEntity<InstitutionResponseDTO> findIntitutionDetail(@PathVariable("id") Long institutionId){
        InstitutionResponseDTO dto = institutionService.findInstitutionDetail(institutionId);
        return ResponseEntity.ok(dto);

    }



}
