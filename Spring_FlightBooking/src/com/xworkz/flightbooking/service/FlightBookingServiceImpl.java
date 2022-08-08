package com.xworkz.flightbooking.service;

import java.time.LocalDateTime;

import com.xworkz.flightbooking.dao.FlightBookingDAO;
import com.xworkz.flightbooking.dto.FlightBookingDTO;

public class FlightBookingServiceImpl implements FlightBookingService {

	private FlightBookingDAO flightBookingDAO;

	public boolean validateAndSave(FlightBookingDTO bookingDTO) {
		
		if (bookingDTO != null) {
			int id = bookingDTO.getId();
			String passengerName  = bookingDTO.getPassengerName();
			boolean international = bookingDTO.isInternational();
			String	passportNo	= bookingDTO.getPassportNo();
			String	airline	= bookingDTO.getAirline();
			String	boarding = bookingDTO.getBoarding();
			String	destination = bookingDTO.getDestnation();
			double	ticketPrice = bookingDTO.getTicketPrice();
			LocalDateTime travelDateAndTime = bookingDTO.getTravelDateAndTime();
			double	gstPercentage = bookingDTO.getGstPercentage();
			double	totalPrice = bookingDTO.getTotalPrice();
		
		
		System.out.println("Running service for booking");
		return false;
	}
		return this.flightBookingDAO.save(bookingDTO); 
	}
}
