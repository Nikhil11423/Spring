package com.xworkz.profile.service;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.profile.dao.ProfileDAO;
import com.xworkz.profile.entity.ProfileEntity;
import com.xworkz.profile.otp.OtpGenerator;

@Component
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	private ProfileDAO dao;
	
	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private OtpGenerator otp;
	
	int count;
	
	@Override
	public boolean validateAndSave(ProfileEntity entity,Model model) {
		System.out.println("From Serive layer");
		
		if (entity != null) {
			if (entity.getPassword().equals(entity.getConfirmPassword())&& this.findByUserId(entity.getFullName())==null) {
				ProfileEntity entity2 = new ProfileEntity();
				BeanUtils.copyProperties(entity, entity2);
				entity2.setCreatedBy(entity.getFullName());
				entity2.setCreatedDateTime(LocalDateTime.now());
				entity2.getOtp();
				entity2.getActiveStatus();
				dao.save(entity2);
				return true;
			} else {
				model.addAttribute("samePassword", "both password is not equal");
				System.out.println("both password is not equal");
				return false;
			}
		} else {
			System.out.println("invalid data");
			return false;
		}
	}

	@Override
	public ProfileEntity findByUserId(String userId) {
		System.out.println("Running find the method from service");
		ProfileEntity entity=this.dao.findByUserId(userId);
		if(entity !=null) {
			ProfileEntity entity2=new ProfileEntity();
			BeanUtils.copyProperties(entity, entity2);
			return entity2;

		}
		return entity;
	}
	
	@Override
	public ProfileEntity findByUSerIdAndPassword(String userId, String password,Model model) {
		System.out.println("Running find The Method 2 from Service");
		ProfileEntity entity=this.dao.findByUserId(userId);
		if(entity !=null && entity.getPassword().equals(password)) {
			ProfileEntity entity2 = this.dao.findByUserIdAndPassword(userId, password);
			System.out.println("Service working is successfully ");
			this.count=0;
			this.dao.updateloginCountByUserId(null, entity.getUserId());
		return entity2; 
		}else {
			this.count++;
			System.out.println("checking the password" +this.count);
			model.addAttribute("error", "Check the password");
			if(count <=3) {
				this.dao.updateloginCountByUserId(count, userId);
			}
			
			if(this.count >=3) {
				System.out.println("checking the condition" +this.count);
				System.out.println("showing forget password");
				model.addAttribute("checking condition" +this.count );
				model.addAttribute("forget", "Entered 3 times wrong password");
				model.addAttribute("resetpassword", "Ur account is blocked Plz rest the password ");
				return null;
			}
		
		}
               return ProfileService.super.findByUSerIdAndPassword(userId, password, model);	
	}

	@Override
	public void UpdatePasswordByUserId(String newPassword, String userId) {
		ProfileEntity entity=this.dao.findByUserId(userId);
		if(entity!=null) {
			System.out.println("The update password successfully");
			this.dao.UpdatePasswordByUserId(newPassword, userId);	
			
			SimpleMailMessage mailMessage= new SimpleMailMessage();
			mailMessage.setFrom("nikhilbasan14@outlook.com");
			mailMessage.setReplyTo("nikhilbasan14@outlook.com");
			mailMessage.setTo(entity.getEmail());
			mailMessage.setSubject("NewPassword");
			mailMessage.setText(" Hi " + "\n" + "\n" 
			+ entity.getFullName() + "\n" + "\n" 
			+ "We received a request to access your account :" + "\n" + "\n" 
			+ entity.getEmail() +"\n" + "\n" 
			+ "Your Newpassword is :"  + newPassword + "\n" + "\n" 
			+ "Your Password Reset Succesfully" );
			System.out.println("Mail Succesfully send");
			mailSender.send(mailMessage);
		}
	}

	@Override
	public boolean generateOTP(String userId, String otp, Model model) {
		System.out.println("From dervice layer" + userId + otp);
		ProfileEntity entity=this.dao.findByUserId(userId);
		if(entity !=null) {
			
//			SimpleMailMessage mailMessage= new SimpleMailMessage();
//			mailMessage.setFrom("nikhilbasan14@outlook.com");
//			mailMessage.setReplyTo("nikhilbasan14@outlook.com");
//			mailMessage.setTo(entity.getEmail());
//			mailMessage.setSubject("OTP Generate");
//			mailMessage.setText("Hi" + "\n" + "\n"
//		    + entity.getFullName() + "\n" + "\n"
//			+ "We received a request to access your account :" + "\n" + "\n"  
//            + entity.getEmail() + "\n" + "\n"
//			+ "Your OTP Code is :" + otp);
//			System.out.println("Mail Succesfully send");
//			mailSender.send(mailMessage);
			dao.generateOTP(userId, otp);
		}
		return ProfileService.super.generateOTP(userId, otp, model);
	}

	@Override
	public ProfileEntity updateOtpByUserId(String userId, String otp, Model model) {
		System.out.println("Running verify oto the method from service");
		ProfileEntity entity=this.dao.findByUserId(userId);
		if(entity!=null && entity.getOtp().equals(otp)) {
			System.out.println("OTP valid");
			LocalDateTime dateTime=null;
			dao.updateOtpGeneratedTimeByUserId(LocalDateTime.now(), userId);
		return entity;
	}else {
		System.out.println("Invalid OTP");
	}
  return ProfileService.super.updateOtpByUserId(userId, otp, model);
	}

	@Override
	@Scheduled( cron ="*/100 * * * * *")
	public void updateOtpByScheduler() {
		this.dao.updateOtpByScheduler(LocalDateTime.now().minusMinutes(10));
		System.out.println("Scheduler is working");

		ProfileService.super.updateOtpByScheduler();
	}

	

//	@Override
//	public void updateProfileEntityByUserId(String userId, String newfullName) {
//		System.out.println("update the profile entity");
//		ProfileEntity entity=this.dao.findByUserId(userId);
//		if(entity !=null) {
//			this.dao.updateProfileEntityByUserId(newfullName, userId);
//		}
//		
//	}
}



