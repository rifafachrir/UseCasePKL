package com.useCase.tugas_pkl.service;

import com.useCase.tugas_pkl.dto.operation.OperationCreateRequestDTO;

public interface OperationService {

    public void createNewOperation(OperationCreateRequestDTO dto);

}
