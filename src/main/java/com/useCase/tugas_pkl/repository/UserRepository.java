package com.useCase.tugas_pkl.repository;

import com.useCase.tugas_pkl.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
