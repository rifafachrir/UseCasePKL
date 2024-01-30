package com.useCase.tugas_pkl.repository;

import com.useCase.tugas_pkl.domain.UserAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAuditRepository extends JpaRepository<UserAudit, Long> {

}
