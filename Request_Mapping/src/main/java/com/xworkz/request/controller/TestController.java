package com.xworkz.request.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {

	public TestController() {
		System.out.println("Cretaing the Test Controller");
	}
	
	@RequestMapping("/Apply.do")
	public String onClick() {
		System.out.println("Creating the Onclick Method");
		return "index.html";
		
	}
}
