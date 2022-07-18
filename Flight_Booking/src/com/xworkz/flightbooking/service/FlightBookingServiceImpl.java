package com.xworkz.flightbooking.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.flightbooking.dao.FlightBookingDAO;
import com.xworkz.flightbooking.dto.FlightBookingDTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@Component
@ToString
public class FlightBookingServiceImpl implements FlightBookingService {
	@Autowired
	private FlightBookingDAO dao;


	@Override
	public boolean validateAndSave(FlightBookingDTO dto) {
		
	
		if (dto != null) {
			int id = dto.getId();
			String passengerName  = dto.getPassengerName();
			boolean international = dto.isInternational();
			String	passportNo	= dto.getPassportNo();
			String	airline	= dto.getAirline();
			String	boarding = dto.getBoarding();
			String	destination = dto.getDestination();
			double	ticketPrice = dto.getTicketPrice();
			LocalDateTime travelDateAndTime = dto.getTravelDateAndTime();
			double	gstPercentage = dto.getGstPercentage();
			//double	totalPrice = dto.getTotalPrice();
		
			if (passengerName != null && !passengerName.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && passengerName.length() >= 3
					&& passengerName.length() < 40) {
				System.out.println("passengerName is valid");
			} else {
				System.out.println("passengerName is invalid");

			}
			if (passportNo != null && !passportNo.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && passportNo.length() >= 8
					&& passportNo.length() < 40) {
				System.out.println("passportNo is valid");
			} else {
				System.out.println("passportNo is invalid");

			}
			
			if (airline != null && !airline.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")
					&& airline.length() > 3 && airline.length() < 40) {
				System.out.println("airline is valid");
			} else {
				System.out.println("airline is invalid");
			}
			if (boarding != null && !boarding.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && boarding.length() >= 3
					&& boarding.length() < 40) {
				System.out.println("boarding is valid");
			} else {
				System.out.println("boarding is invalid");

			}
			if (destination != null && !destination.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && destination.length() >= 3
					&& destination.length() < 40) {
				System.out.println("destination is valid");
			} else {
				System.out.println("destination is invalid");

			}
			if (ticketPrice > 0 && ticketPrice < 2500) {
				System.out.println("ticketPrice is valid");
			} else {
				System.out.println("ticketPrice is invalid");
			}
			if (international == true) {
				dto.setGstPercentage(25.0);
				System.out.println("Its International");
			} else {
				dto.setGstPercentage(12.0);
				System.out.println("Its Domestic");
			}

			double totalPrice = dto.getTotalPrice();
			totalPrice = ticketPrice + ((gstPercentage / 100) * ticketPrice);
			dto.setTotalPrice(totalPrice);
		}

		return dao.save(dto);
		//boolean saved= this.dao.save(dto);

	}

			
}