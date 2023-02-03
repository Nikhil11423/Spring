package com.xworkz.profile.otp;

import java.util.SplittableRandom;

import org.springframework.stereotype.Component;

@Component
public class OtpGenerator {
	
	public static String otp(int otp) {
		SplittableRandom splittableRandom=new SplittableRandom();
		
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<otp;i++) {
			sb.append(splittableRandom.nextInt(0,10));
		}
		return sb.toString();	
	}
}
