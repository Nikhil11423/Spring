package com.xworkz.armydetails.service;

import com.xworkz.armydetail.excepetion.InvalidDataException;
import com.xworkz.armydetails.dto.ArmyDetailsDTO;

public interface ArmyDetailsService {

	boolean validateAndSave(ArmyDetailsDTO dto)throws InvalidDataException ;
}
