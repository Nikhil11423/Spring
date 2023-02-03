package com.xworkz.dao;

import com.xworkz.entities.Address;
import com.xworkz.entities.Employee;

public interface UserDAO {
	
	boolean save(Employee employee, Address address);
	
}
