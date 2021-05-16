package com.ayvan.springbootwithangular.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayvan.springbootwithangular.exception.UserNotFoundException;
import com.ayvan.springbootwithangular.model.Employee;
import com.ayvan.springbootwithangular.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}
	
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee findEmployeeById(Long id) {
		return employeeRepository.findEmployeeById(id)
				.orElseThrow(
						() -> new UserNotFoundException ("User by id "+ id + " was not found"));
	}
	
	public void deleteEmployee(Long id) {
		employeeRepository.deleteEmployeeById(id);
	}
}
