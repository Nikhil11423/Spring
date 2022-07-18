package com.xworkz.metro.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MetroScheduleDTO {

	
	private Integer id;
	private String station;
	private Integer platform;
	private Integer trainNo;
	private LocalDateTime dateAndtime;
	private String passengerName;
	private String destination;
	private double ticketPrice;
	private Integer duration;
	
}
