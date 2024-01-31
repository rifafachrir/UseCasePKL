package com.useCase.tugas_pkl.repository;

import com.useCase.tugas_pkl.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAllByNameLike(String name);
    List<Role> findAllById(Long roleId);
}
