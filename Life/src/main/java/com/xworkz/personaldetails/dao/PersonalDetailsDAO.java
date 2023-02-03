package com.xworkz.personaldetails.dao;

import org.springframework.stereotype.Component;

import com.xworkz.personaldetails.entity.PersonalDetailsEntity;

@Component
public interface PersonalDetailsDAO {
	
	 boolean save(PersonalDetailsEntity entity);
	
}
