package com.xworkz.trafic_info.service;

import com.xworkz.trafic_info.dto.TrafficDTO;

public interface TrafficService {
	
	boolean validateAndSave(TrafficDTO dto);

}
