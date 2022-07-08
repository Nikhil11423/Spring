package com.xworkz.springframework.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springfw")
@Component
@Setter
public class CountryBean {
	private String name, missIndia, pmName, countryCode, capitalCity, founder, currencyType, language, largestCity,
			bigState;
	private int noOfStates, noOfDistricts, noOfTaluk;
	private double totalBoundary;

	@Value("India")
	public void setName(String name) {
		this.name = name;
	}

	@Value("sowmya")
	public void setMissIndia(String missIndia) {
		this.missIndia = missIndia;
	}

	@Value("sowmya")
	public void setPmName(String pmName) {
		this.pmName = pmName;
	}

	@Value("+91")
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Value("New delhi")
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	@Value("sowmya")
	public void setFounder(String founder) {
		this.founder = founder;
	}

	@Value("Rs")
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	@Value("hindi")
	public void setLanguage(String language) {
		this.language = language;
	}

	@Value("dont know")
	public void setLargestCity(String largestCity) {
		this.largestCity = largestCity;
	}

	@Value("refer above ansr")
	public void setBigState(String bigState) {
		this.bigState = bigState;
	}

	@Value("28")
	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	@Value("56865")
	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}

	@Value("66314656")
	public void setNoOfTaluk(int noOfTaluk) {
		this.noOfTaluk = noOfTaluk;
	}

	@Value("54641348962321")
	public void setTotalBoundary(double totalBoundary) {
		this.totalBoundary = totalBoundary;
	}

	@Override
	public String toString() {
		return "CountryBean [name=" + name + ", missIndia=" + missIndia + ", pmName=" + pmName + ", countryCode="
				+ countryCode + ", capitalCity=" + capitalCity + ", founder=" + founder + ", currencyType="
				+ currencyType + ", language=" + language + ", largestCity=" + largestCity + ", bigState=" + bigState
				+ ", noOfStates=" + noOfStates + ", noOfDistricts=" + noOfDistricts + ", noOfTaluk=" + noOfTaluk
				+ ", totalBoundary=" + totalBoundary + "]";
	}

}

