package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {

	public TestController() {
		System.out.println("Creating the Test Controller");
	}
	
	@RequestMapping("/add.do")
	public String display() {
		System.out.println("Displaying a Message Successfully");
		return "index.html";
		
	}
	

}
