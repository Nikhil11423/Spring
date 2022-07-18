package com.xworkz.recharge.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.recharge.dao.RechargeDAO;
import com.xworkz.recharge.dto.RechargeDTO;

import lombok.ToString;


@Component
@ToString
public class RechargeServiceImpl implements RechargeService{

    @Autowired
	private RechargeDAO rechargeDAO;

	@Override
	public boolean validateAndSave(RechargeDTO rechargeDTO) {

		if (rechargeDTO != null) {
			int id = rechargeDTO.getId();
			String name = rechargeDTO.getName();
			double discount = rechargeDTO.getDiscount();
			double cash = rechargeDTO.getCash();
			String code = rechargeDTO.getCode();
			int validity = rechargeDTO.getValidity();
			boolean free = rechargeDTO.isFree();

			if (id > 0) {
				System.out.println("Id is valid");
			} else {
				System.out.println("Id is Invalid");
			}

			if(name !=null && name.length()>4 && name.length()<40) {
				System.out.println("Name is valid");
			} else {
				System.out.println("Name is Invalid");
			}

			if (code != null && code.matches("\\s*\\S+\\s*") && code.length() >= 3 && code.length() <= 20) {
				System.out.println("code is valid");
			} else {
				System.out.println("code is Invalid");
			}

			if (validity > 0 && validity < 30) {
				System.out.println("validity is valid");
			} else {
				System.out.println("validity is Invalid");
			}

			if (free == true) {
				System.out.println("Discount of 7% price");
				rechargeDTO.setDiscount(7d);
			}

			if (free == false) {
				System.out.println("Discount of 2% price");
				rechargeDTO.setDiscount(2d);
			}

			double cash1 = cash - rechargeDTO.getDiscount();
			rechargeDTO.setCash(cash);

			boolean saved = rechargeDAO.save(rechargeDTO);
			return saved;

		}
		return false;

	}

		
		
	}
