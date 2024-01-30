package com.useCase.tugas_pkl.service;

import com.useCase.tugas_pkl.dto.institution.InstitutionCreateRequestDTO;
import com.useCase.tugas_pkl.dto.institution.InstitutionResponseDTO;


public interface InstitutionService {

    public void createNewInstitution(InstitutionCreateRequestDTO dto);

    public InstitutionResponseDTO findInstitutionDetail(Long institutionId);
}
