package xom.xworkz.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xom.xworkz.sb.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	

}
