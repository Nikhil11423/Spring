package com.xworkz.runner;


import com.xworkz.dao.UserDAO;
import com.xworkz.dao.UserDAOImpl;
import com.xworkz.entities.Address;
import com.xworkz.entities.Employee;


public class UserRunner {

	public static void main(String[] args) {
		Employee entity = new Employee();
		entity.setEmployeeName("Akshay");
		entity.setEmail("akki057@gmail.com");
		entity.setSalary(89000.0);
		
		Address add =new Address();
		add.setCity("Borgaon");
		add.setPincode(591216);
		add.setState("Karantaka");
		add.setStreet("SYM");
		
		entity.setAddress(add);
		add.setEmployee(entity);
		
		UserDAO dao= new UserDAOImpl();
		dao.save(entity, add);	
	}
}
