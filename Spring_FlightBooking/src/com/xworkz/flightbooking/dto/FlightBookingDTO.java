package com.xworkz.flightbooking.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingDTO implements Serializable {

	// string -> 3 && <40
	private int id;
	private String passengerName; // aceept only space
	private boolean international;
	private String passportNo;
	private String airline;
	private String boarding;
	private String destnation; // no space
	private double ticketPrice; // >1000
	private LocalDateTime travelDateAndTime = LocalDateTime.now(); // future date
	private double gstPercentage; // international(true)=25 & international(false)=12
	private double totalPrice; // ticketPrice+gst
}
