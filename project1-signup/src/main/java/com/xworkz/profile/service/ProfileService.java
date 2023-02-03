package com.xworkz.profile.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.profile.entity.ProfileEntity;

@Component
public interface ProfileService {

	 boolean validateAndSave(ProfileEntity entity,Model model);
	 

	ProfileEntity findByUserId(String name);

	default ProfileEntity findByUSerIdAndPassword(String userId, String password,Model model) {
		return null;
	}
	
	 default void UpdatePasswordByUserId(String  newpassword,String userId) {
		 
	 }
	 
	default boolean generateOTP(String userId,String otp,Model model) {
		return false;	
	}
	   
	default ProfileEntity updateOtpByUserId(String userId,String otp,Model model) {
		return null;
	}
   
	default void updateOtpByScheduler() {
		
	}
    
    


   
}
