package com.xworkz.armydetail;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.armydetails.configuration.SpringConfiguration;
import com.xworkz.armydetails.dao.ArmyDetailsDAO;
import com.xworkz.armydetails.dto.ArmyDetailsDTO;
import com.xworkz.armydetails.service.ArmyDetailsServiceImpl;

public class ArmyDetailsBoot {

	public static void main(String[] args) {
		
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ArmyDetailsServiceImpl impl=container.getBean(ArmyDetailsServiceImpl.class);
		
		ArmyDetailsDAO dao=container.getBean(ArmyDetailsDAO.class);
		
     // ArmyDetailsDTO dto =new 	ArmyDetailsDTO(1,"Indian Army",LocalDate.of(1950, 1, 26), "India","Army", 1237117,960000,"Seva Paramo Dharma","Ram Nath Kovind","General Manoj Pande","L General B.S","Delhi");	
      //ArmyDetailsDTO dto =new 	ArmyDetailsDTO(0,"USA Army",LocalDate.of(1775, 7, 14), "US","Army", 485000,1005725,"This We'll Defend","Joe Biden","Gen James C","Gen Joseph M","Virginia");
      //ArmyDetailsDTO dto =new 	ArmyDetailsDTO(0,"RAF",LocalDate.of(1918, 1, 15), "Russian","Army", 1000000,2000000,"This We'll Defend","Putin","Shoygu","Garasimov","Moscow");
	 // ArmyDetailsDTO dto =new 	ArmyDetailsDTO(0,"British Army",LocalDate.of(1660, 1, 1), "UK","Army", 86976,29401,"This We'll Defend","Queen Elizabeth","G Sir Patrick Sanders","L Gen Sir Christopher","London");
	 // ArmyDetailsDTO dto =new 	ArmyDetailsDTO(0,"Pakistan Army",LocalDate.of(1947, 8, 14), "Pakistan","Army", 560000,550000,"Iman,taqwa,jihad fi sabilillah","Arif Alvi","Gen Qamar Javed Bajwa","Lt.Gen.Azhar Abbas","Rawalpindi");
	 // ArmyDetailsDTO dto =new 	ArmyDetailsDTO(0,"Bangladesh Army",LocalDate.of(1971, 3, 26), "Bangladesh","Army", 269760,0,"In War,we are everywhere for our nation","Pm","Gen SM Shafiuddin Ahmed","Lt.Gen Ataul Hakim Sarwar Hasan","Dhaka");
	 // ArmyDetailsDTO dto =new 	ArmyDetailsDTO(0,"South Africa Army",LocalDate.of(1992, 1, 1), "South Africa","Army", 40121,12300,"For the Motherland","Thandi Modise","lt Gen Lawrence Mbatha","M Gen Michael","Pretoria");		 // ArmyDetailsDTO dto =new 	ArmyDetailsDTO(0,"British Army",LocalDate.of(1660, 1, 1), "UK","Army", 86976,29401,"This We'll Defend","Queen Elizabeth","G Sir Patrick Sanders","L Gen Sir Christopher","London");
	 // ArmyDetailsDTO dto =new 	ArmyDetailsDTO(0,"Armed Force Ukraine",LocalDate.of(1917, 3, 29), "Ukraine","Army", 196600,900000,"ntg","Volodymyr Zelenskyy","Oleksii Reznikov","Valerii Zaluzhnyi","Kyiv");
	  ArmyDetailsDTO dto =new 	ArmyDetailsDTO(0,"Australian Army",LocalDate.of(1901, 3, 1), "Australia","Army", 29633,20123,"Aus Defend","David Hurley","Lt Gen Rick Burr","M Gen Authony Rawlins","Canberra");


      
      
      
      
      System.out.println(dto);
      impl.validateAndSave(dto);
      
      
      
	}

}
