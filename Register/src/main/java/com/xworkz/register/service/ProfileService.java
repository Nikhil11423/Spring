package com.xworkz.register.service;


import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.register.entity.ProfileEntity;

public interface ProfileService {

	default boolean validateAndSave(ProfileEntity entity, Model model) {
		return false;
	}
	ProfileEntity findByEmailId(String emailId);
	
	default ProfileEntity findByEmailIdAndPassword(String emailId, String password,Model model) {
		return null;
	}
	List<Object> getAllUserInfo();
	
	ProfileEntity deleteById(int id);
}
