package com.xworkz.recharge.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor

public class RechargeDTO implements Serializable{
	
	@NonNull
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private double discount;
	@NonNull
	private double cash;
	@NonNull
	private String code;
	@NonNull
	private Integer validity;
	@NonNull
	private boolean free;

}
