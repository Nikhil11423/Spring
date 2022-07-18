package com.xworkz.recharge.service;

import com.xworkz.recharge.dto.RechargeDTO;

public interface RechargeService {
	
	boolean validateAndSave(RechargeDTO dto);

}
