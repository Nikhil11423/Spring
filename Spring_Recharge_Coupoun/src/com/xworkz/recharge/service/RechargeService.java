package com.xworkz.recharge.service;

import com.xworkz.recharge.dto.RechargeDTO;
import com.xworkz.recharge.excepetion.InvalidDataException;

public interface RechargeService {
	
	boolean validateAndSave(RechargeDTO dto)throws InvalidDataException;

}
