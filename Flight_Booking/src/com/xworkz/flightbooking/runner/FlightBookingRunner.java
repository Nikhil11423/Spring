package com.xworkz.flightbooking.runner;

import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.flightbooking.configuration.SpringConfiguration;
import com.xworkz.flightbooking.dao.FlightBookingDAO;
import com.xworkz.flightbooking.dao.FlightBookingDAOImpl;
import com.xworkz.flightbooking.dto.FlightBookingDTO;
import com.xworkz.flightbooking.service.FlightBookingService;
import com.xworkz.flightbooking.service.FlightBookingServiceImpl;

public class FlightBookingRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext container =new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FlightBookingServiceImpl  service=container.getBean(FlightBookingServiceImpl.class);
		//System.out.println(serv);
		
		FlightBookingDAO dao =container.getBean (FlightBookingDAOImpl.class);
		
		//FlightBookingService service=container.getBean( FlightBookingService.class);
		
		FlightBookingDTO dto=new FlightBookingDTO(0,"Suraj",false,"$Pass010","Star Airline","Belagavi","Bangalore", 900d,LocalDateTime.of(2022, 8, 25, 03, 45), 29,1500);
        System.out.println(dto);  

	    service.validateAndSave(dto);
	    
	    dao.save(dto);
	    
      

       
	
	}
}

