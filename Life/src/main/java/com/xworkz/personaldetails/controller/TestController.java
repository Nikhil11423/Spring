package com.xworkz.personaldetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.personaldetails.entity.PersonalDetailsEntity;
import com.xworkz.personaldetails.service.PersonalDetailsService;

@Component
@RequestMapping("/")
public class TestController {
	
	@Autowired
	private PersonalDetailsService service;
	
	public TestController() {
		System.out.println("test controller");
	}
	@RequestMapping("/save.do")
	public String toSave(PersonalDetailsEntity entity,Model model) {
		System.out.println("toSave is working");
		return null;
		
//		PersonalDetailsEntity plus =service.getname(entity.getEmailId());
//		
//		if(plus  == null) {
//		boolean save= service.validateAndSave(entity,model);
//		System.out.println(save);
//		
//		if(save == true) {
//			model.addAttribute("save", "Your all details are save successfully");
//			model.addAttribute("data",entity);
//			return "save.jsp";
//		}else {
//			model.addAttribute("same", "Given details are not saved");
//            return "index.jsp";		
//		}
//		  	
//			
//		}else {
//			model.addAttribute("same","details are not save bcz ur detitals are already exist");
//		return "index.jsp";
//		}
//	}
}
}
