package com.ayvan.springbootwithangular.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayvan.springbootwithangular.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);

}
