package com.xworkz.resort.runner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.entity.ResortEntity;

public class ResortRunner {

	public static void main(String[] args) {

		//ResortEntity entity=new ResortEntity(1, "AToZ","Borgaon",LocalTime.of(12, 00),LocalTime.of(11, 00), "Srinath",LocalDate.now(),LocalDate.now(), "Nikhil", 200D); 
		ResortEntity entity1=new ResortEntity(2, "Baro Hogonna","Belagavi",LocalTime.of(01, 00),LocalTime.of(02, 00), "Lakkapa",LocalDate.now(),LocalDate.now(), "Nikhil", 200D); 

		
		ResortDAO dao=new ResortDAOImpl();
		
		boolean saved =dao.save(entity1);
		System.out.println("Saved :" +saved);
		
		
		
	}

}
