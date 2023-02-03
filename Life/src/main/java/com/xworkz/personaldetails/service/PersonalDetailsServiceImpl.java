package com.xworkz.personaldetails.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.personaldetails.dao.PersonalDetailsDAO;
import com.xworkz.personaldetails.entity.PersonalDetailsEntity;



@Component
public class PersonalDetailsServiceImpl implements PersonalDetailsService{

	@Autowired
	private PersonalDetailsDAO dao;
	
	@Override
	public boolean validateAndSave(PersonalDetailsEntity entity, Model model) {
		
		if (entity != null) {
			if (entity.getPassword().equals(entity.getPassword())) {
				PersonalDetailsEntity entity2 = new PersonalDetailsEntity();
				BeanUtils.copyProperties(entity, entity2);
				dao.save(entity2);
				return true;
			} else {
				model.addAttribute("samePassword", "both password is not equal");
				System.out.println("both password is not equal");
				return false;
			}
		} else {
			System.out.println("invalid data");
			return false;
		}
	}
	
	}