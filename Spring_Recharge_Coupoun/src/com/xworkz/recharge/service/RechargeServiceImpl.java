package com.xworkz.recharge.service;


import java.io.InvalidClassException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.recharge.dao.RechargeDAO;
import com.xworkz.recharge.dto.RechargeDTO;
import com.xworkz.recharge.excepetion.InvalidDataException;

import lombok.ToString;


@Component
@ToString
public class RechargeServiceImpl implements RechargeService{

    @Autowired
	private RechargeDAO rechargeDAO;

	@Override
	public boolean validateAndSave(RechargeDTO rechargeDTO) throws InvalidDataException {

		if (rechargeDTO != null) {
			int id = rechargeDTO.getId();
			String name = rechargeDTO.getName();
			double discount = rechargeDTO.getDiscount();
			double cash = rechargeDTO.getCash();
			String code = rechargeDTO.getCode();
			int validity = rechargeDTO.getValidity();
			boolean free = rechargeDTO.isFree();

			if (id >= 0) {
				System.out.println("Id is valid");
			} else {
				System.out.println("Id is Invalid");
				throw new InvalidDataException("Enter the valid data");

			}

			if(name !=null && name.length()>4 && name.length()<40) {
				System.out.println("Name is valid");
			} else {
				System.out.println("Name is Invalid");
				throw new InvalidDataException("Enter the valid data");

			}

			if (code != null && code.matches("\\s*\\S+\\s*") && code.length() >= 3 && code.length() <= 20) {
				System.out.println("code is valid");
			} else {
				System.out.println("code is Invalid");
				throw new InvalidDataException("Enter the valid data");

			}

			if (validity > 0 && validity < 60) {
				System.out.println("validity is valid");
			} else {
				System.out.println("validity is Invalid");
				throw new InvalidDataException("Enter the valid data");

			}

			if (free == true) {
				System.out.println("Discount of 7% price");
				rechargeDTO.setDiscount(7d);
				//throw new InvalidDataException("Enter the valid data");

			}

			if (free == false) {
				System.out.println("Discount of 2% price");
				rechargeDTO.setDiscount(2d);
				//throw new InvalidDataException("Enter the valid data");

			}

			double cash1 = cash - rechargeDTO.getDiscount();
			rechargeDTO.setCash(cash);
			//throw new InvalidDataException("Enter the valid data");


			boolean saved = rechargeDAO.save(rechargeDTO);
			return saved;

		}
		return false;

	}

		
		
	}
