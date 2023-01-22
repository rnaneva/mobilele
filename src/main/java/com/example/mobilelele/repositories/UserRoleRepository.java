package com.example.mobilelele.repositories;

import com.example.mobilelele.model.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<RoleEntity, Long> {
}
