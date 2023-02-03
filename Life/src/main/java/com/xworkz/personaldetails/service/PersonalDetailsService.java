package com.xworkz.personaldetails.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.personaldetails.entity.PersonalDetailsEntity;

@Component
public interface PersonalDetailsService {
	
	 boolean validateAndSave(PersonalDetailsEntity entity, Model model);

}
