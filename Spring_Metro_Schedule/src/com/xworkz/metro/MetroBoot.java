package com.xworkz.metro;

import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.metro.configuration.SpringConfiguration;
import com.xworkz.metro.dao.MetroScheduleDAO;
import com.xworkz.metro.dao.MetroScheduleDAOImpl;
import com.xworkz.metro.dto.MetroScheduleDTO;
import com.xworkz.metro.service.MetroScheduleServiceImpl;

public class MetroBoot {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		MetroScheduleServiceImpl service = container.getBean(MetroScheduleServiceImpl.class);

		MetroScheduleDAO dao = container.getBean(MetroScheduleDAOImpl.class);

		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Jalahalli", 4, 690235, LocalDateTime.of(2022, 8, 6, 9, 45, 30),"Lucky", "Yeshvantpur", 10d, 1);
		//MetroScheduleDTO dto1 = new MetroScheduleDTO(0, "Yeshvanthpur", 2, 608765,LocalDateTime.of(2022, 8, 6, 9, 50, 00), "Appu", "Sandalshop", 17d, 3);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Jalahalli", 4, 690235, LocalDateTime.of(2022, 8, 6, 9, 50, 30),"Kiran", "Mahalaxmi", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "mahalaxmi", 4, 690235, LocalDateTime.of(2022, 8, 6, 9, 55, 30),"Ramesh", "Rajajinagar", 10d, 5);
       //  MetroScheduleDTO dto = new MetroScheduleDTO(0, "Rajajinaga", 4, 690235, LocalDateTime.of(2022, 8, 6, 9, 59, 30),"Satya", "Kuvempu Road", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Kuvempu Road", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 5, 30),"Akshta", "Srirampura", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Srirampura", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 9, 30),"Sonali", "Sampige Road", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Sampige Road", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 15, 30),"Akshay", "Chikpete", 10d, 3);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Chikpete", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 20, 30),"Dhanraj", "KR Market", 10d, 3);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "KR Market", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 25, 30),"Nikhil", "National park", 10d, 4);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "National park", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 30, 30),"Srinath", "Lalbag", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Lalbag", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 35, 30),"Suraj", "SouthEnd", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "SouthEnd Circle", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 40, 30),"Aniket", "Jayanager", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Jayanager", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 45, 30),"Suhas", "RV Road", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "RV Road", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 50, 30),"Sanjay", "Banashankari", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Banashankari", 4, 690235, LocalDateTime.of(2022, 8, 6, 10, 55, 30),"Laxmi", "JP Nagar", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "JP Nagar", 4, 690235, LocalDateTime.of(2022, 8, 6, 9, 59, 30),"Shree", "Puttenahalli", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Puttenahalli", 4, 690235, LocalDateTime.of(2022, 8, 6, 9, 15, 30),"Ranjita", "Mysore Road", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Mysore Road", 2, 690247, LocalDateTime.of(2022, 8, 6, 9, 20, 30),"Arpita", "Deepanjali Nagar", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Deepanjali Nagar", 2, 690247, LocalDateTime.of(2022, 8, 6, 9, 25, 30),"Amruta", "Attiguppe", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "Attiguppe", 2, 690247, LocalDateTime.of(2022, 8, 6, 9, 30, 30),"Lucky", "Priyanka", 10d, 5);
		//MetroScheduleDTO dto = new MetroScheduleDTO(0, "VijayNagar", 2, 690247, LocalDateTime.of(2022, 8, 6, 9, 35, 30),"Pragati", "Hosahalli", 10d, 5);
		MetroScheduleDTO dto = new MetroScheduleDTO(0, "Hosahalli", 2, 690247, LocalDateTime.of(2022, 8, 6, 9, 40, 30),"Varsha", "KSRP", 10d, 5);

		
		System.out.println(dto);
		service.validateAndSave(dto);
		
		// dao.save(dto);

	}
}
