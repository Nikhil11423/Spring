package com.xworkz.register.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.profile.constants.ApplicationConstant;
import com.xworkz.register.entity.ProfileEntity;
import com.xworkz.register.service.ProfileService;

@Component
@RequestMapping("/")
public class Controller {

	@Autowired
	private ProfileService service;

	@Autowired
	private MailSender sender;
	@Autowired
	private JavaMailSender javaMailSender;
	
    public Controller() {
		System.out.println("From Controller");
	}

	@RequestMapping("/save.do")
	public String onSave(ProfileEntity entity, Model model) {

		System.out.println("Running Save Method");
			System.out.println(entity);
			boolean save = service.validateAndSave(entity, model);
			System.out.println(save);
			if (save) {
				
				SimpleMailMessage mailMessage= new SimpleMailMessage();
				mailMessage.setFrom("nikhilbasan14@outlook.com");
				mailMessage.setReplyTo("nikhilbasan14@outlook.com");
				mailMessage.setTo(entity.getEmailId());
				mailMessage.setSubject("Register  Successfull");
				mailMessage.setText("\n" + "\n" 
						+ "Hi Dear.."+ "\n" + "\n" 
				        + entity.getName() + "\n" + "\n" 
						+ "Your Registration is Successfull.." + "\n" + "\n" 
						+entity.getEmailId() + "\n" + "\n"
						+ "Kind regards" + "\n" + "\n"
						+ "Nikhil RB");
				System.out.println(mailMessage.toString());
				//sender.send(mailMessage);
				javaMailSender.send(mailMessage);
			System.out.println("Mail sent successfully");
				model.addAttribute(ApplicationConstant.SUCCESS, ApplicationConstant.SUCCESSMSG);
				model.addAttribute("data", entity);
				return "success.jsp";
			} else {
				model.addAttribute(ApplicationConstant.REPEAT,ApplicationConstant.REPEATMSG);
				return "register.jsp";
			}
	}
			
			@PostMapping("/login.do")
			public String toLogin(ProfileEntity entity,Model model) {
				System.out.println("toLogin is working");
			
				ProfileEntity log=service.findByEmailIdAndPassword(entity.getEmailId(),entity.getPassword(), model);
				if(log !=null) {
					ProfileEntity findByEmailId = service.findByEmailId(entity.getEmailId());

					ProfileEntity entity2=new ProfileEntity();
					entity2.setEmailId(findByEmailId.getEmailId());
					entity2.setName(findByEmailId.getName());
					entity2.setPhoto(findByEmailId.getPhoto());
					entity2.setPassword(findByEmailId.getPassword());
					model.addAttribute(ApplicationConstant.PROFILE,ApplicationConstant.PROFILEMSG);
			    model.addAttribute("data", entity);
					return "successlogin.jsp";
				}else {
		          model.addAttribute(ApplicationConstant.PROFILE,ApplicationConstant.PROFILEERR);
		          return "login.jsp";
				}
				
				}
			@RequestMapping("/edit.do")
			public String onEdit(ProfileEntity entity,Model model) {
			ProfileEntity findByEmailId = service.findByEmailId(entity.getEmailId());
			ProfileEntity entity2=new ProfileEntity();
			entity2.setEmailId(findByEmailId.getEmailId());
			entity2.setName(findByEmailId.getName());
			entity2.setPhoto(findByEmailId.getPhoto());
			entity2.setPassword(findByEmailId.getPassword());
	
			model.addAttribute("data",entity2);
				return "edit.jsp";
				
			}
			@RequestMapping("/user.do")
			public String getAllUserInfo(Model model) {
				System.out.println("getAlluserInfo() invoked");
				List<Object> entity1 = this.service.getAllUserInfo();
				model.addAttribute("data", entity1);
				return "userlist.jsp";
}	
			@RequestMapping("/delete.do")
			public String deleteIdByName(String name,int id, Model model) {
				System.out.println("deleteByStudentName() invoked " + id);
				ProfileEntity deleteById = this.service.deleteById(id);
						model.addAttribute("delete", "is deleted successfully!!");
						model.addAttribute("data", id);
						return "delete.jsp";
			}	
}

