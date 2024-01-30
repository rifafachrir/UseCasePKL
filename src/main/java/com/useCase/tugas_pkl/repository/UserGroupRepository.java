package com.useCase.tugas_pkl.repository;

import com.useCase.tugas_pkl.domain.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {

}
