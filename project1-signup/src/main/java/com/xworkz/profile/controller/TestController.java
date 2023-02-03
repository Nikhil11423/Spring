package com.xworkz.profile.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.profile.constants.ApplicationConstant;
import com.xworkz.profile.entity.ProfileEntity;
import com.xworkz.profile.service.ProfileService;

@Component
@RequestMapping("/")
public class TestController {

	@Autowired
	private ProfileService service;
	
	@Autowired
	private MailSender mailSender;
	
	
	public TestController() {
		System.out.println("test controller");
	}

	@RequestMapping("/save")
	public String toSave(ProfileEntity entity, Model model) {
		System.out.println("toSave is working");

		ProfileEntity add = service.findByUserId(entity.getUserId());

		if (add == null) {
			boolean save = service.validateAndSave(entity, model);
			System.out.println(save);

			if (save) {
			
				SimpleMailMessage mailMessage= new SimpleMailMessage();
				mailMessage.setFrom("nikhilbasan14@outlook.com");
				mailMessage.setReplyTo("nikhilbasan14@outlook.com");
				mailMessage.setTo(entity.getEmail());
				mailMessage.setSubject("Register  Successfull");
				mailMessage.setText("Hi" + entity.getFullName() + "\n" + "\n" 
						+ " " + entity.getUserId() + "\n" + "\n" 
						+ "Your Registration is Successfull" + entity.getEmail());
				System.out.println(mailMessage.toString());
				mailSender.send(mailMessage);
				
				model.addAttribute(ApplicationConstant.SUCCESS, ApplicationConstant.SUCCESSMSG);
				model.addAttribute("data", entity);
				return "success";
			} else {
				model.addAttribute(ApplicationConstant.REPEAT,ApplicationConstant.REPEATMSG );
				return "register";
			}

		} else {
			model.addAttribute(ApplicationConstant.REPEAT, ApplicationConstant.REPEATMSGERR);
			return "register";

		}
	}

	
	@PostMapping("/login")
	public String toLogin(ProfileEntity entity,Model model) {
		System.out.println("toLogin is working");
		
		ProfileEntity log=service.findByUSerIdAndPassword(entity.getUserId(),entity.getPassword(), model);
		if(log !=null) {
			
	    model.addAttribute(ApplicationConstant.PROFILE,ApplicationConstant.PROFILEMSG);
	    model.addAttribute("data", entity);
			return "successlogin";
		}else {
          model.addAttribute(ApplicationConstant.PROFILE,ApplicationConstant.PROFILEERR);
          return "login";
		}
          
	}
	}
	
