package com.xworkz.bbmp.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bbmp.configuration.BbmpConfiguration;
import com.xworkz.bbmp.dto.BbmpDTO;
import com.xworkz.bbmp.excepetion.InvalidDataException;
import com.xworkz.bbmp.service.BbmpService;

public class BbmpStarter {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BbmpConfiguration.class);

		BbmpService service = context.getBean(BbmpService.class);

		//BbmpDTO bbmpDTO = new BbmpDTO(1, 130, "RajaRajeshwari Nagar", "Sharadha", "S T Somashekar", 5000000, 3500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(2, 131, "Rajraj Nagar", "Shartha", "Somashekar", 6000000, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(3, 132, "Attiguppe", "Anand C Hosur ", "Suraj", 5600000, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(4, 133, "Hampi Nagar", "Azmal Beig", "Srinath", 3500000, 2500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(5, 134, "Bapuji Nagar", "Imran Pasha", "Nikhil", 7000000, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(6, 135, "Padarayanapura", "Seema Althaf Khan ", "Raghu", 7200000, 6500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(7, 136, "Jagajivanaram Nagar", "Shartha", "Yashwanth", 5000000, 4500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(8, 137, "Rayapuram", "Shartha", "Shashikala G V	", 3000000, 1500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(9, 138, "Chelavadi Palya", "Rekha R", "Reddy", 4500000, 500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(10, 139, "KR Market", "Nazima Khanam ", "Pratheek", 5600000, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(11, 140, "Chamraja Pet", "G Kokila Chandrashekhar", "Suhas", 5070000, 5000050);
		//BbmpDTO bbmpDTO = new BbmpDTO(12, 141, "Azad Nagar", "M Sujatha", "Sanjay", 6020000, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(13, 142, "Sunkenahalli", "D N Ramesh ", "Rajshekar", 6006000, 3500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(14, 143, "Vishveshwara Puram", "Vani V Rao", "suresh", 6000800, 4500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(15, 144, "Siddapura	", "Shartha", "sunil", 6000900, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(16, 145, "Hombegowda Nagar", "Mujahid Pasha A", "Ravi", 6000200, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(17, 146, "Lakkasandra", "D Chandrappa 	", "Madhu", 6000500, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(18, 147, "Adugodi", "K Mahesh Babu 	", "Maruthi", 6000800, 5506000);
		//BbmpDTO bbmpDTO = new BbmpDTO(19, 148, "Ejipura", "Manjula ", "Giftan", 6020000, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(20, 149, "Varthur", "T Ramachandra 	", "Sundeep", 5005000, 5000900);
		//BbmpDTO bbmpDTO = new BbmpDTO(21, 150, "Bellanduru", "Pushpa G M", "Singham", 5080000, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(22, 151, "Koramangala	", "A Asha", "Nanu", 4000600, 2500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(23, 152, "Suddagunte Palya", "M Chandrappa", "Ninu", 3006000, 1500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(24, 153, "Jaya Nagar", "Vikiiy", "Gangambike", 3000900, 5500000);
		//BbmpDTO bbmpDTO = new BbmpDTO(25, 154, "Basavanagudi", "B S Satyanarayana ", "Avnu", 7000400, 5506000);
		//BbmpDTO bbmpDTO = new BbmpDTO(26, 155, "Hanumanth Nagar", "H A Kempegowda", "Iavanu", 6070000, 5509000);
		//BbmpDTO bbmpDTO = new BbmpDTO(27, 156, "Sri Nagar", "J M Savitha 	", "Yakey", 6005000, 5500800);
		BbmpDTO bbmpDTO = new BbmpDTO(28, 157, "Gali Anjenaya Temple", "Uma N", "Somashekar", 6008000, 5506000);

		try {
			boolean save = service.validateAndSave(bbmpDTO);
			System.out.println(save);
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}

	}

}
