package com.xworkz.armydetails.service;

import com.xworkz.armydetails.dto.ArmyDetailsDTO;

public interface ArmyDetailsService {

	boolean validateAndSave(ArmyDetailsDTO dto);
}
