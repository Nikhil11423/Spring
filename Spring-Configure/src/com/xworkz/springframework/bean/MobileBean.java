package com.xworkz.springframework.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springfw")
@Component
@Getter
@Setter
public class MobileBean {
	private String name;
	private String brand;
	private String mfctr;
	private int modelNo;
	private int batteryCapacity;
	private int frontCamera;
	private int rearCamera;
	private int frontCameraInPxls;
	private int rearCameraInPxls;
	private double price;
	private String madeIn;
	private String mfgdate;
	private double sarValue;
	private int regNo;

	public MobileBean(@Value("Oneplus 9R 5G") String name, @Value("Oneplus") String brand,
			@Value("BKB Electronics") String mfctr, @Value("20165") int modelNo, @Value("4500") int batteryCapacity,
			@Value("1") int frontCamera, @Value("3") int rearCamera, @Value("32") int frontCameraInPxls,
			@Value("64") int rearCameraInPxls, @Value("48000.0") double price, @Value("China") String madeIn,
			@Value("10-10-2021") String mfgdate, @Value("3.4") double sarValue, @Value("456585665") int regNo) {
		super();
		this.name = name;
		this.brand = brand;
		this.mfctr = mfctr;
		this.modelNo = modelNo;
		this.batteryCapacity = batteryCapacity;
		this.frontCamera = frontCamera;
		this.rearCamera = rearCamera;
		this.frontCameraInPxls = frontCameraInPxls;
		this.rearCameraInPxls = rearCameraInPxls;
		this.price = price;
		this.madeIn = madeIn;
		this.mfgdate = mfgdate;
		this.sarValue = sarValue;
		this.regNo = regNo;
	}

	@Override
	public String toString() {
		return "MobileBean [name=" + name + ", brand=" + brand + ", mfctr=" + mfctr + ", modelNo=" + modelNo
				+ ", batteryCapacity=" + batteryCapacity + ", frontCamera=" + frontCamera + ", rearCamera=" + rearCamera
				+ ", frontCameraInPxls=" + frontCameraInPxls + ", rearCameraInPxls=" + rearCameraInPxls + ", price="
				+ price + ", madeIn=" + madeIn + ", mfgdate=" + mfgdate + ", sarValue=" + sarValue + ", regNo=" + regNo
				+ "]";
	}



}

