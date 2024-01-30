package com.useCase.tugas_pkl.repository;

import com.useCase.tugas_pkl.domain.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long> {

}
