package com.xworkz.bbmp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bbmp.dao.BbmpDAO;
import com.xworkz.bbmp.dto.BbmpDTO;
import com.xworkz.bbmp.excepetion.InvalidDataException;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class BbmpServiceImpl implements BbmpService {

	@Autowired
	private BbmpDAO bbmpDAO;

	@Override
	public boolean validateAndSave(BbmpDTO bbmpDTO) throws InvalidDataException {

		if (bbmpDTO != null) {
			int id = bbmpDTO.getId();
			int wardNo = bbmpDTO.getWardNo();
			String wardName = bbmpDTO.getWardName();
			String corporator = bbmpDTO.getCorporator();
			String mla = bbmpDTO.getMla();
			double budget = bbmpDTO.getBudget();
			double spent = bbmpDTO.getSpent();
			// double reamning = bbmpDTO.getReamning();

			if (id > 0) {
				System.out.println("Id is valid");
			} else {
				System.out.println("Id is Invalid");
				throw new InvalidDataException("Enter the correct data of Id");
			}

			if (wardNo > 0 && wardNo <= 200) {
				System.out.println("WardNo is valid");
			} else {
				System.out.println("WardNo is Invalid");
				throw new InvalidDataException("Enter the correct data of WardNo");
			}

			if (wardName != null && wardName.matches("^[a-zA-Z\\s]*$") && wardName.length() >= 3
					&& wardName.length() < 40) {
				System.out.println("PassengerName is Valid");
			} else {
				System.out.println("PassengerName is Invalid");
				throw new InvalidDataException("Enter the correct data of WardName");
			}

			if (corporator != null && !corporator.matches(".[0-9,!@#$%^&()_+{}><.;,<>].*") && corporator.length() >= 3
					&& corporator.length() < 40) {
				System.out.println("Corporator is Valid");
			} else {
				System.out.println("Corporator is Invalid");
				throw new InvalidDataException("Enter the correct data of Corporator");
			}

			if (mla != null && !mla.matches(".[0-9,!@#$%^&()_+{}><.;,<>].*") && mla.length() >= 3
					&& mla.length() < 40) {
				System.out.println("Corporator is Valid");
			} else {
				System.out.println("Corporator is Invalid");
				throw new InvalidDataException("Enter the correct data of MLA");
			}

			if (budget > 10000 && budget < 30000000) {
				System.out.println("Budget is Valid");
			} else {
				System.out.println("Budget is Invalid");
				throw new InvalidDataException("Enter the correct data of Budget");
			}

			if (spent > 0) {
				System.out.println("Spent is Valid");
			} else {
				System.out.println("Spent is Invalid");
				throw new InvalidDataException("Enter the correct data of Spent");
			}

			double reamning = budget - spent;
			bbmpDTO.setReamning(reamning);
		}
		return bbmpDAO.save(bbmpDTO);

	}
}
