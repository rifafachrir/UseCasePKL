package com.useCase.tugas_pkl.service.Implement;

import com.useCase.tugas_pkl.domain.Institution;
import com.useCase.tugas_pkl.dto.institution.InstitutionCreateRequestDTO;
import com.useCase.tugas_pkl.dto.institution.InstitutionResponseDTO;
import com.useCase.tugas_pkl.exception.ResourceNotFoundException;
import com.useCase.tugas_pkl.repository.InstitutionRepository;
import com.useCase.tugas_pkl.service.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    InstitutionRepository institutionRepository;

    @Override
    public void createNewInstitution(InstitutionCreateRequestDTO dto) {

        Institution institution = new Institution();
        institution.setName(dto.getName());

        institutionRepository.save(institution);
    }

    @Override
    public InstitutionResponseDTO findInstitutionDetail(Long institutionId) {
        Institution institution = institutionRepository.findById(institutionId)
                .orElseThrow(()-> new ResourceNotFoundException("institution.not.found"));

        InstitutionResponseDTO dto = new InstitutionResponseDTO();
        dto.setId(institution.getId());
        dto.setName(institution.getName());
        return dto;
    }
}
