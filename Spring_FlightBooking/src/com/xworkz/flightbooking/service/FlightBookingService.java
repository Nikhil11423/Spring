package com.xworkz.flightbooking.service;

import com.xworkz.flightbooking.dto.FlightBookingDTO;

public interface FlightBookingService {

	boolean validateAndSave(FlightBookingDTO flightBookingDTO);

}
