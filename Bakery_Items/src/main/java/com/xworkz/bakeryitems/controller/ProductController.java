package com.xworkz.bakeryitems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.bakeryitems.dto.BakeryDTO;
import com.xworkz.bakeryitems.service.BakeryitemsService;

@Component
@RequestMapping("/")
@EnableWebMvc
public class ProductController {

	@Autowired
	private BakeryitemsService serBakeryitemsService;

	public ProductController() {
		System.out.println("Creating the Product Controller");
	}

	@PostMapping("/add.do")
	public String onAdd(BakeryDTO dto, Model model) {
		System.out.println("Test the Controller");

		boolean save = serBakeryitemsService.validateAndSave(dto);
		System.out.println(save);

		if (dto.getName()!=null && dto.getName().length()>4) {
			
			model.addAttribute("msg", "Bakeryitems are Saved");
			model.addAttribute("data", dto);
			return "Success.jsp";
		} else {
			model.addAttribute("msg", "Bakeryitems are not saved");
			return "index.jsp";
		}
		
	}

}
