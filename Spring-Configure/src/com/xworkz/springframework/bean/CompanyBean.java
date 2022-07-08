package com.xworkz.springframework.bean;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springfw")
@Component
@Getter
@Setter
public class CompanyBean {
	private String name;
	private int noOfEmployees;
	private String location;
	private int noOfDirectors;
	private String md;
	private String chairman;
	private String ceo;
	private String president;
	private double incomeInCr;
	private double revenueIncr;
	private double profitFor2019InCr;
	private double profitFor2020InCr;
	private double profitFor2021InCr;
	private double profitFor2022InCr;
	@Override
	public String toString() {
		return "CompanyBean [name=" + name + ", noOfEmployees=" + noOfEmployees + ", location=" + location
				+ ", noOfDirectors=" + noOfDirectors + ", md=" + md + ", chairman=" + chairman + ", ceo=" + ceo
				+ ", president=" + president + ", incomeInCr=" + incomeInCr + ", revenueIncr=" + revenueIncr
				+ ", profitFor2019InCr=" + profitFor2019InCr + ", profitFor2020InCr=" + profitFor2020InCr
				+ ", profitFor2021InCr=" + profitFor2021InCr + ", profitFor2022InCr=" + profitFor2022InCr + "]";
	}
	
	

}

