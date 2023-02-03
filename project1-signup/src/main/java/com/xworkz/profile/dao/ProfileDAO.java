package com.xworkz.profile.dao;


import java.time.LocalDateTime;

import com.xworkz.profile.entity.ProfileEntity;

public interface ProfileDAO {
	
	 boolean save(ProfileEntity entity);
	 
	 ProfileEntity findByUserId(String userId);
	 
	 ProfileEntity findByUserIdAndPassword(String userId,String password);
	 
	 void UpdatePasswordByUserId(String  password,String userId) ;

	 boolean generateOTP(String userId, String otp);
		
     ProfileEntity updateloginCountByUserId(Integer count,String userId);
     
     default void updateOtpGeneratedTimeByUserId(LocalDateTime dateTime,String userId) {
    	 
     }

     default void updateOtpByScheduler(LocalDateTime dateTime) {
    	 
     }
}
