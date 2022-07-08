package com.xworkz.springframework.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@ComponentScan(basePackages = "com.xworkz.springframework")
@Component
@Getter
@Setter
public class MotorBean {
	
	private String brand;
	private String brandCollectionName;
	private String brandColor;
	private int ModelNo;
	private double voltage;
	private float pipeSize;
	private String bodyMaterial;
	private int speedInRPM;
	private double rating;
	private String powerSource;
	private double warranty;
	private String phase;
	private String current;
	private double price;
	
	public MotorBean(@Value("Belfin") String brand,@Value("Belfin 775 DC High Speed Motor") String brandCollectionName,
			@Value("gray") String brandColor,@Value("775") int ModelNo,
			@Value("12.0") double voltage,@Value("3") float pipeSize,
			@Value("Metal") String bodyMaterial,@Value("100") int speedInRPM,
			@Value("4.5") double rating,@Value("DC") String powerSource,
			@Value("2.0") double warranty,@Value("single") String phase,
			@Value("DC") String current,@Value("250.0") double price) {
		this.brand=brand;
		this.brandCollectionName=brandCollectionName;
		this.brandColor=brandColor;
		this.ModelNo=ModelNo;
		this.voltage=voltage;
		this.pipeSize=pipeSize;
		this.bodyMaterial=bodyMaterial;
		this.speedInRPM=speedInRPM;
		this.rating=rating;
		this.powerSource=powerSource;
		this.warranty=warranty;
		this.phase=phase;
		this.current=current;
		this.price=price;
	}
	


	@Override
	public String toString() {
		return "MotorBean [brand=" + brand + ", brandCollectionName=" + brandCollectionName + ", brandColor="
				+ brandColor + ", ModelNo=" + ModelNo + ", voltage=" + voltage + ", pipeSize=" + pipeSize
				+ ", bodyMaterial=" + bodyMaterial + ", speedInRPM=" + speedInRPM + ", rating=" + rating
				+ ", powerSource=" + powerSource + ", warranty=" + warranty + ", phase=" + phase + ", current="
				+ current + ", price=" + price + "]";
	}	

			
}