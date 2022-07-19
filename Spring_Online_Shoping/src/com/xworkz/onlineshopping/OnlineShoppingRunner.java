package com.xworkz.onlineshopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.onlineshopping.configuration.SpringConfiguration;
import com.xworkz.onlineshopping.dao.OnlineShoppingDAO;
import com.xworkz.onlineshopping.dao.OnlineShoppingDAOImpl;
import com.xworkz.onlineshopping.dto.OnlineShoppingDTO;
import com.xworkz.onlineshopping.excepetion.InvalidDataException;
import com.xworkz.onlineshopping.service.OnlineShoppingService;
import com.xworkz.onlineshopping.type.Data;

public class OnlineShoppingRunner {
	
	public static void main(String[] args) {
		
	
	ApplicationContext container =new AnnotationConfigApplicationContext(SpringConfiguration.class);
	
	OnlineShoppingService service=container.getBean(OnlineShoppingService.class);
	
	OnlineShoppingDAO dao =new OnlineShoppingDAOImpl();
	
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "sofa", 15000.0, "furniture", 1, "G-pay", "25 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Mobile", 25000.0, "electronic", 4, "Cash", "18 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Cake", 15000.0, "Food", 4, "G-pay", "5 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Chair", 5000.0, "furniture", 4, "G-pay", "25 percent", 6);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Cipla", 1000.0, "Medicine", 12, "G-pay", "12 percent", 12);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Corocin", 2300.0, "Medicine", 12, "G-pay", "12 percent", 12);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "altretamine", 2990.0, "Medicine", 12, "P-pay", "12 percent", 12);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Astelin", 3400.0, "Medicine", 12, "paytem", "12 percent", 12);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Dolo", 3450.0, "Medicine", 12, "cash", "12 percent", 12);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Metformin", 1500.0, "Medicine", 12, "Amazon-pay", "12 percent", 12);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Omeprazole", 5000.0, "Medicine", 12, "G-pay", "12 percent", 12);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Bed", 35000.0, "furniture", 1, "G-pay", "25 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Bookshelf", 8000.0, "furniture", 1, "G-pay", "25 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Armchair", 5000.0, "furniture", 1, "G-pay", "25 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Coffee Table", 9000.0, "furniture", 1, "G-pay", "25 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Cupboard", 14000.0, "furniture", 1, "G-pay", "25 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "TV", 13000.0, "electronic", 4, "Cash", "18 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "AC", 5000.0, "electronic", 4, "Cash", "18 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Refrigerator", 18000.0, "electronic", 4, "Cash", "18 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Washing Machine", 25000.0, "electronic", 4, "Cash", "18 percent", 8);
	//OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Masala puri", 6000.0, "Food", 4, "G-pay", "5 percent", 8);
	OnlineShoppingDTO shopping = new OnlineShoppingDTO(0, "Vegitable", 5000.0, "Food", 4, "G-pay", "5 percent", 8);


	//OnlineShopping shopping =new OnlineShoppingDTO(0, "Sofa", 15000.0, "Furniture", 2, "G-Pay", 25, 7,Data.FOOD);
	
    //System.out.println(shopping);
	
		//service.validateAndSave(shopping);
		try {
			boolean save = service.validateAndSave(shopping);
			System.out.println(save);
		} catch (InvalidDataException e) {

			e.printStackTrace();
		}

}
}
