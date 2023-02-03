package xom.xworkz.sb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xom.xworkz.sb.dao.EmployeeRepository;
import xom.xworkz.sb.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository emplRepository;


	@Override
	public List<Employee> getAllEmployees() {
		System.out.println("Service - Get All Employees");
		return emplRepository.findAll();	}

	@Override
	public void saveEmployee(Employee employees) {
		System.out.println("Service - Save Employees");
		this.emplRepository.save(employees);
	}

	@Override
	public Employee getEmployeeById(long id) {

		Optional<Employee> opt = emplRepository.findById(id);
		Employee empl;
		if (opt.isPresent()) {
			empl = opt.get();
		} else {
			throw new RuntimeException("Employee not found for id: " + id);
		}

		return empl;
	}

	@Override
	public void deleteEmployeeId(long id) {

		this.emplRepository.deleteById(id);
	}

}
