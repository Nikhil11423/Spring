package com.xworkz.springfw.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;


@Component
@Getter
public class HeadphoneBean {
	
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
	
	
	public HeadphoneBean(@Value("blutooth") String type, @Value("Boat") String companyName,
			@Value("a234") String modelName, @Value("2.0") Double warranty, @Value("1299.0") Double price,
			@Value("blue") String color, @Value("4.8") double rating, @Value("blutooth") String connectivity,
			@Value("true") boolean deepBass, @Value("2.0") double batterylife, @Value("true") boolean waterResistant,
			@Value("good") String soundQuality, @Value("15") int wirelessRange, @Value("2.0") double chargingTime) {
		this.type = type;
		this.companyName = companyName;
		this.modelName = modelName;
		this.warranty = warranty;
		this.price = price;
		this.color = color;
		this.rating = rating;
		this.connectivity = connectivity;
		this.deepBass = deepBass;
		this.batterylife = batterylife;
		this.waterResistant = waterResistant;
		this.soundQuality = soundQuality;
		this.wirelessRange = wirelessRange;
		this.chargingTime = chargingTime;
	}
	
	
	@Override
	public String toString() {
		return "HeadphoneBean [type=" + type + ", companyName=" + companyName + ", modelName=" + modelName
				+ ", warranty=" + warranty + ", price=" + price + ", color=" + color + ", rating=" + rating
				+ ", connectivity=" + connectivity + ", deepBass=" + deepBass + ", batterylife=" + batterylife
				+ ", waterResistant=" + waterResistant + ", soundQuality=" + soundQuality + ", wirelessRange="
				+ wirelessRange + ", chargingTime=" + chargingTime + "]";
	}

	
	


}