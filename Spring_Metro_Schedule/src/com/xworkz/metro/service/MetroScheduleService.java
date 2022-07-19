package com.xworkz.metro.service;

import java.io.InvalidClassException;

import com.xworkz.metro.dto.MetroScheduleDTO;
import com.xworkz.metro.excepetion.InvalidDataException;

public interface MetroScheduleService {
	
	boolean validateAndSave(MetroScheduleDTO dto) throws  InvalidDataException;

}
