package com.xworkz.recharge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.recharge.configuration.SpringConfiguration;
import com.xworkz.recharge.dto.RechargeDTO;
import com.xworkz.recharge.excepetion.InvalidDataException;
import com.xworkz.recharge.service.RechargeService;

public class RechargeBoot {

	public static void main(String[] args) {
		
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		RechargeService service =container.getBean(RechargeService.class);

		
		//RechargeDTO dto=new RechargeDTO(0, "Airtel", 50, 580d, "ABCD12", 84, true);
		//RechargeDTO dto=new RechargeDTO(0, "JIO", 20, 660d, "JGVCD13", 84, false);
		//RechargeDTO dto=new RechargeDTO(0, "TATASKY", 15, 250d,"Tata88", 28, true);
		//RechargeDTO dto=new RechargeDTO(0, "Mobikwik", 40, 50d, "KWIK20", 5, true);
		//RechargeDTO dto=new RechargeDTO(0, "VI", 15, 458, "VI12", 28, false);
		//RechargeDTO dto=new RechargeDTO(0, "Flipcard", 40, 3000, "ASDDJJK", 30, false);
		//RechargeDTO dto=new RechargeDTO(7, "AB", 10, 268, "Air123", 28, true);
		//RechargeDTO dto=new RechargeDTO(8, "Jio", 45, 600, "SDFGHJ8", 28, false);
		//RechargeDTO dto=new RechargeDTO(9, "TATAPlay", 15, 250d,"Tata88", 28, true);
		//RechargeDTO dto=new RechargeDTO(10,"Airtel", 70, 580d, "ABCD12", 84, true);
		//RechargeDTO dto=new RechargeDTO(0, "Baklava Box", 250d,900d,"TXKHDV", 30, false);
		//RechargeDTO dto=new RechargeDTO(0, "Amazon", 300d, 1500d, "MYNZSK", 15, true);
		//RechargeDTO dto=new RechargeDTO(0, "Mobikwik", 40d, 50d,"GHGHGGH",12,true);
		//RechargeDTO dto=new RechargeDTO(0, "JIO", 20, 660d, "JGVCD13", 84, false);
		//RechargeDTO dto=new RechargeDTO(0, "Amazon", 300d, 1500d, "MYNZSK", 15, true);
		//RechargeDTO dto=new RechargeDTO(0, "Flipcard", 40, 3000, "ASDDJJK", 30, false);
		//RechargeDTO dto=new RechargeDTO(0, "LPG", 15, 1000d, "LPG56", 45, true);
		//RechargeDTO dto=new RechargeDTO(0, "Baklava Box", 250d,900d,"TXKHDV", 30, false);
		//RechargeDTO dto=new RechargeDTO(0, "Mobikwik", 40, 50d, "KWIK20", 5, true);
		//RechargeDTO dto=new RechargeDTO(0, "Lens", 30, 700, "Len109", 90, true);
		//RechargeDTO dto=new RechargeDTO(0, "JIO", 50, 560d, "JGVCD13", 84, false);
		//RechargeDTO dto=new RechargeDTO(0, "Airtel", 35, 580d, "ABCD90", 84, true);
		//RechargeDTO dto=new RechargeDTO(0, "JIO", 20, 660d, "JGVCD10", 84, false);
		//RechargeDTO dto=new RechargeDTO(0, "LPG", 15, 1000d, "LPG56", 45, true);
		//RechargeDTO dto=new RechargeDTO(0, "Mobikwik", 40, 50d, "KWIK20", 5, true);
		//RechargeDTO dto=new RechargeDTO(0, "Amazon", 300d, 1500d, "MYNZSK", 15, true);
		RechargeDTO dto=new RechargeDTO(0, "Baklava Box", 250d,900d,"TXKHDV", 30, true);

		
		
		try {
			boolean save = service.validateAndSave(dto);
			System.out.println(save);
		} catch (InvalidDataException e) {

			e.printStackTrace();
		}
	

	}

}
