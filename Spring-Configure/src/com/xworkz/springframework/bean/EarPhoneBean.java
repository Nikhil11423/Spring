package com.xworkz.springframework.bean;

import org.springframework.context.annotation.ComponentScan;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springfw")
@Getter
@Setter
public class EarPhoneBean {
	private String type;
	private String companyName;
	private String modelName;
	private Double warranty;
	private Double price;
	private String color;
	private double rating;
	private String connectivity;
	private boolean deepBass;
	private double batterylife;
	private boolean waterResistant;
	private String soundQuality;
	private int wirelessRange;
	private double chargingTime;
	private int wieghtInGms;

	@Override
	public String toString() {
		return "EarPhoneBean [type=" + type + ", companyName=" + companyName + ", modelName=" + modelName
				+ ", warranty=" + warranty + ", price=" + price + ", color=" + color + ", rating=" + rating
				+ ", connectivity=" + connectivity + ", deepBass=" + deepBass + ", batterylife=" + batterylife
				+ ", waterResistant=" + waterResistant + ", soundQuality=" + soundQuality + ", wirelessRange="
				+ wirelessRange + ", chargingTime=" + chargingTime + ", wieghtInGms=" + wieghtInGms + "]";
	}
	
}
