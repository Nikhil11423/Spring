package com.xworkz.bakeryitems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bakeryitems.dao.BakeryDAO;
import com.xworkz.bakeryitems.dto.BakeryDTO;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class BakeryitemsServiceImpl implements BakeryitemsService {

	@Autowired
	private BakeryDAO dao;

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
        System.out.println("Printing the data");
		return this.dao.save(dto);
	}

}
