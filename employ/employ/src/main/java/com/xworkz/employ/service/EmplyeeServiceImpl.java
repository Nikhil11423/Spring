package com.xworkz.employ.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.employ.dao.EmployeeRepository;
import com.xworkz.employ.dto.Employee;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmploy(Employee employee) {
		this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {

		Optional<Employee> option = employeeRepository.findById(id);
		Employee empl = null;
		if (option.isPresent()) {
			empl = option.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}

		return empl;
	}

	@Override
	public void deleteEmployeeById(long id) {

		this.employeeRepository.deleteById(id);

	}

}
