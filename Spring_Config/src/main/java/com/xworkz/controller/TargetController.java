package com.xworkz.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TargetController {

	public TargetController() {
		System.out.println("Create the TargetController");
	}
	
	@RequestMapping("/nikhil")
	public String onTest() {
		System.out.println("Rest the testing");
		return "index.html";
	}
	

}
