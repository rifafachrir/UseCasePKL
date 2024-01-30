package com.useCase.tugas_pkl.repository;

import com.useCase.tugas_pkl.domain.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstitutionRepository extends JpaRepository<Institution, Long> {
    List<Institution> findAllById(Long id);

}
