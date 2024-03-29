package com.dakr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartmentId(Long departmentId);
}
