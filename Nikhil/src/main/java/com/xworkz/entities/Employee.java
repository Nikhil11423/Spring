package com.xworkz.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name ="employee_table")
@DynamicUpdate
@NamedQueries({ @NamedQuery(name = "EmployeeAndAdressByAddressId", query = " select employee_table.employeeName,address_table.address_id from employee_table left join address_table on employee_table.address_id = address_table.address_id order by employee_table.employeeName"),
    @NamedQuery(name ="EmployeeAndAdressByEmployeeId" , query = "Select emp FROM Employee emp LEFT JOIN FETCH emp.address WHERE  emp.employeeId=:empId")})
public class Employee {
	@Id
	@Column(name= "employee_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	private String employeeName;
	private String email;
	private Double salary;
	
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="address_id")
	private Address address;


	public Integer getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Employee(Integer employeeId, String employeeName, String email,Double salary, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
		this.address = address;
	}


	public Employee() {
		super();
	}
	
	
}
