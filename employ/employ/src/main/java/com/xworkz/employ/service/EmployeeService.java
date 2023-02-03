package com.xworkz.employ.service;

import java.util.List;

import com.xworkz.employ.dto.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void saveEmploy(Employee employee);

	Employee getEmployeeById(long id);

	void deleteEmployeeById(long id);

}
