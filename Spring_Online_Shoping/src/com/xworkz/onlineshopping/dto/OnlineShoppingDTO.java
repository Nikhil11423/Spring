package com.xworkz.onlineshopping.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnlineShoppingDTO implements Serializable {
	
	private int id;
	private String product;
	private double price;
	private String type;
	private int quantity;
	private String paymentMode;
	private String discount;
	private int gstPercent;
	//private Data data;

}
