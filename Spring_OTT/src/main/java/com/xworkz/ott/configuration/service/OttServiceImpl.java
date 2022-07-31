package com.xworkz.ott.configuration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ott.configuration.dao.OttDAO;
import com.xworkz.ott.dto.OttDTO;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class OttServiceImpl implements OttService{
	
	@Autowired
	private OttDAO dao;

	@Override
	public boolean  validateAndSave(OttDTO dto) {
		
		System.out.println("Printing the data");
		return this.dao.save(dto);
	}
	

}
