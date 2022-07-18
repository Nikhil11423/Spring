package com.xworkz.bbmp.service;

import com.xworkz.bbmp.dto.BbmpDTO;
import com.xworkz.bbmp.excepetion.InvalidDataException;

public interface BbmpService {

	boolean validateAndSave(BbmpDTO bbmpDTO) throws InvalidDataException;

}
