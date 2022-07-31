package com.xworkz.ott.configuration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ott.configuration.service.OttService;
import com.xworkz.ott.dto.OttDTO;

@Component
@RequestMapping("/")
public class ControllerContent {
	@Autowired
	private OttService ottservice;

	public ControllerContent() {
		System.out.println("ControllerContent created");
	}

	

	@PostMapping("/Save.do")
	public String doDisplay(OttDTO dto) {
		boolean save= ottservice.validateAndSave(dto);
		System.out.println(save);
		return "index.html";
	}

}
