package com.xworkz.flightbooking.service;

import org.springframework.stereotype.Component;

import com.xworkz.flightbooking.dto.FlightBookingDTO;

@Component
public interface FlightBookingService {

	boolean validateAndSave(FlightBookingDTO dto);

}