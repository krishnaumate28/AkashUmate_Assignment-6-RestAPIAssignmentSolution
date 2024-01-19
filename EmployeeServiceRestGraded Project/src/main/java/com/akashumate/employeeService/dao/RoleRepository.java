package com.greatLearning.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.akashumate.employeeService.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}