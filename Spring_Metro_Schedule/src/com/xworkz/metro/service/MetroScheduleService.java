package com.xworkz.metro.service;

import com.xworkz.metro.dto.MetroScheduleDTO;

public interface MetroScheduleService {
	
	boolean validateAndSave(MetroScheduleDTO dto);

}
