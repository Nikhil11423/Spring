package com.xworkz.metro.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.metro.dao.MetroScheduleDAO;
import com.xworkz.metro.dto.MetroScheduleDTO;

import lombok.ToString;

@Component
@ToString
public class MetroScheduleServiceImpl implements MetroScheduleService {

	@Autowired
	private MetroScheduleDAO dao;
	
	
	@Override
	public boolean validateAndSave(MetroScheduleDTO dto) {
	
		if(dto !=null) {
			int id =dto.getId();
			String station=dto.getStation();
			int platfromNo=dto.getPlatform();
			int trainNo=dto.getTrainNo();
			LocalDateTime dateAndTime =dto.getDateAndtime();
			String passengerName=dto.getPassengerName();
			String denstination=dto.getDestination();
			double price =dto.getTicketPrice();
			double duration=dto.getDuration();
			
			
			
			if(station !=null && station.length()>4 && station.length()<40) {
				System.out.println("Station is valid");
			}else {
				System.out.println("Station is invalid");
			}
			
			if(platfromNo != 0 ) {
				System.out.println("Platform number is valid");
			}else {
				System.out.println("Platform number is invalid");
			}
			if(trainNo != 0 ) {
				System.out.println("Train number is valid");
			}else {
				System.out.println("Train number is invalid");
			}
		
			if(passengerName !=null && passengerName.length() >4 && passengerName.length()<40) {
				System.out.println("PassengerName is valid");
			}else {
				System.out.println("PassengerName is invalid");
			}
			if ( denstination != null && denstination.length() > 3 && denstination.length() < 40 && !denstination.matches("")) {
				System.out.println("denstination is valid");
			} else {
				System.err.println("denstination is invalid");
			}
			if (price  >0 && price< 500) {
				System.out.println("TicketPrice is valid");
			} else {
				System.err.println("TicketPrice is invalid");
			}
			if (duration != 0) {
				System.out.println("Duration is valid");
			} else {
				System.err.println("Duration is invalid");
			}
			
			boolean saved = dao.save(dto);
			return saved;
		   
		}
		return false;
	}

	}
	
