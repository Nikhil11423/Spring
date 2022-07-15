package com.xworkz.flightbooking.dao;

import org.springframework.stereotype.Component;

import com.xworkz.flightbooking.dto.FlightBookingDTO;


public interface FlightBookingDAO {

	boolean save(FlightBookingDTO dto);

}
