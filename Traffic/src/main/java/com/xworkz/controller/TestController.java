package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.trafic_info.dto.TrafficDTO;
import com.xworkz.trafic_info.service.TrafficService;

@Component
@RequestMapping("/")
@EnableWebMvc
public class TestController {

	@Autowired
	private TrafficService service;

	public TestController() {
		System.out.println("Creating the Test Controller");

	}

	@PostMapping("/display.do")
	public String onDisplay(TrafficDTO dto, Model model) {
		System.out.println("Set The OnDisplay Successfully");

		boolean save = service.validateAndSave(dto);
		System.out.println(save);

		
		if (dto.getVehicleRegNo()!=null && dto.getVehicleRegNo().length()>5 &&  dto.getPlace()!=null && dto.getPlace().length()>2) {
			
			model.addAttribute("message", "Traffic info is saved successfully");
			model.addAttribute("data", dto);
			return "Save.jsp";

		} else {
			model.addAttribute("failMessage", "Given data is not saved");
			return "index.jsp";
		}

	
	}
}
