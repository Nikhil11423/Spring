package com.xworkz.trafic_info.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
@Data
public class TrafficDTO implements Serializable{
	
	private String vehicleRegNo;
	private String place;
	private String dateAndTime;
	private String violation;

}
