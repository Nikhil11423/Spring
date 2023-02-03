package com.xworkz.employ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.employ.dao.EmployeeRepository;
import com.xworkz.employ.service.EmployeeService;

import xom.xworkz.sb.entity.Employee;

@Controller
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeRepository employeeRepository;
	
	

	public EmployeeController() {
		super();
	}

    @PostMapping("/saveEmployee")
    public  String saveEmployee(Model model ) {
     model.addAttribute("Employees", employeeRepository.save(entity)) ;  
    }

	@GetMapping("/e_data")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		return "index";
	}

}
