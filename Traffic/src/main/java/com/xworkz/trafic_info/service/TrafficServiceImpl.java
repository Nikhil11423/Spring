package com.xworkz.trafic_info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.trafic_info.dao.TrafficDAO;
import com.xworkz.trafic_info.dto.TrafficDTO;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class TrafficServiceImpl implements TrafficService{

	@Autowired
	private  TrafficDAO dao;
	
	@Override
	public boolean validateAndSave(TrafficDTO dto) {
		System.out.println("Printing the data Success");
		return this.dao.save(dto);
	}

}
