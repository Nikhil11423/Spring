package com.xworkz.springframework.bean;


import org.springframework.context.annotation.ComponentScan;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springframework")
@Getter
@Setter
public class BottleBean {
	private String brand;
	private String brandFounder;
	private int established;
	private String bottleType;
	private String meterialType;
	private String color;
	private boolean bottleCap;
	private String capColor;
	private int quantity;
	private boolean quality;
	private double price;
	private int bestBeforeInMonths;
	private double rating;
	private boolean filterWater;
	private boolean isi;

	@Override
	public String toString() {
		return "BottleBean [brand=" + brand + ", brandFounder=" + brandFounder + ", established=" + established
				+ ", bottleType=" + bottleType + ", meterialType=" + meterialType + ", color=" + color + ", bottleCap="
				+ bottleCap + ", capColor=" + capColor + ", quantity=" + quantity + ", quality=" + quality + ", price="
				+ price + ", bestBeforeInMonths=" + bestBeforeInMonths + ", rating=" + rating + ", filterWater="
				+ filterWater + ", isi=" + isi + "]";
	}
}