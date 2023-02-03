package xom.xworkz.sb.service;

import java.util.List;

import xom.xworkz.sb.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void saveEmployee(Employee employees);

	Employee getEmployeeById(long id);

	void deleteEmployeeId(long id);

}
