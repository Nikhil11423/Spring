package com.xworkz.flightbooking.dto;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingDTO {
	
	private Integer id;
	private String  passengerName;
	private boolean international;
	private String  passportNo;
	private String airline;
	private String boarding;
	private String destination;
	private double  ticketPrice;
	private LocalDateTime travelDateAndTime=LocalDateTime.now();
	private double  gstPercentage;
	private double  totalPrice;

}
