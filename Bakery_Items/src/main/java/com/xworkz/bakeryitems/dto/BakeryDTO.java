package com.xworkz.bakeryitems.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class BakeryDTO implements Serializable {
	
	private String  name ;
	private Integer price;
	private Double  quantity;
	private String  vendor;
	private boolean veg;

}
