package com.useCase.tugas_pkl.repository;

import com.useCase.tugas_pkl.domain.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {

}
