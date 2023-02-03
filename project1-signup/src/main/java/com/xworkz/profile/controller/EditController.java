package com.xworkz.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.profile.entity.ProfileEntity;
import com.xworkz.profile.otp.OtpGenerator;
import com.xworkz.profile.service.ProfileService;
@Component
@RequestMapping("/")
public class EditController {
		
	
	@Autowired
	private ProfileService service;
	
	public EditController() {
	System.out.println();
	}

	@RequestMapping("/edit")
	public String oneditingUserId(ProfileEntity entity,Model model) {
		service.UpdatePasswordByUserId(entity.getPassword(), entity.getUserId());
		model.addAttribute("data", entity);
		
		return "profile";
	

	}
	
	@RequestMapping("/update")
	public String onForgetPassword(ProfileEntity entity,Model model) {
		ProfileEntity ent =service.findByUSerIdAndPassword(entity.getPassword(),entity.getUserId(), model);
		model.addAttribute("data", entity);
		return "forgetpassword";
	}

	@RequestMapping("/otp")
	public String onOtp(ProfileEntity entity, Model model) {
		String otp= OtpGenerator.otp(6);
		service.generateOTP(entity.getUserId(), otp, model);
		model.addAttribute("message", "OTP send to Email");
		model.addAttribute("data", entity);
		return "forgetpassword";
	}
	@RequestMapping("/verifyOTP")
	public String OnverifyOTP(ProfileEntity entity, Model model) {
		service.updateOtpByUserId(entity.getUserId(), entity.getOtp(), model);
		model.addAttribute("data", entity);
		return "forgetpassword";
	}
}
