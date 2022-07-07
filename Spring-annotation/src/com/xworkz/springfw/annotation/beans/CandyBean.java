package com.xworkz.springfw.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
@Component
@Getter
public class CandyBean {
	
	private String name; 
	private String flavour;
	private String color;
	private Double quantity;
	private Double price;
	private String principalIngredient;
	private String otherName; 
	private String type;
	private String packing; 
	private String mfgCompany; 
	private String founder;
	private String Country; 
	private String healthEffects; 
	private Double globalSales;
	
	
	
	
	public CandyBean(@Value("Mikl Duds")String name,@Value("strobery") String flavour,@Value("200d") double price,@Value("white") String color,@Value("4") double quantity,@Value("honey") String principalIngredient, @Value("lollies")String otherName,
			@Value("soft")String type,@Value("wrapper") String packing,@Value("NB company") String mfgCompany,@Value("Nikhil") String founder,@Value("India") String country,@Value("Cavities") String healthEffects,@Value("250d") double globalSale) {
		
		this.name = name;
		this.flavour = flavour;
		this.price=price;
		this.color = color;
		this.principalIngredient = principalIngredient;
		this.otherName = otherName;
		this.type = type;
		this.packing = packing;
		this.mfgCompany = mfgCompany;
		this.founder = founder;
		this.Country = country;
		this.healthEffects = healthEffects;
		this.globalSales=globalSale;
		
	}




	@Override
	public String toString() {
		return "CandyBean [name=" + name + ", flavour=" + flavour + ", color=" + color + ", quantity=" + quantity
				+ ", price=" + price + ", principalIngredient=" + principalIngredient + ", otherName=" + otherName
				+ ", type=" + type + ", packing=" + packing + ", mfgCompany=" + mfgCompany + ", founder=" + founder
				+ ", Country=" + Country + ", healthEffects=" + healthEffects + ", globalSales=" + globalSales + "]";
	} 
	


}
