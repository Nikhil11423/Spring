package com.xworkz.register.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.register.dao.ProfileDAO;
import com.xworkz.register.entity.ProfileEntity;

@Component
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileDAO dao;

   private ProfileEntity entity;
	
	@Override
	public boolean validateAndSave(ProfileEntity entity, Model model) {

		System.out.println("From Service Layer");

		if (entity != null) {
			String name = entity.getName();
			String photo= entity.getPhoto();
			String emailId=entity.getEmailId();
			String password=entity.getPassword();
			long mobileNo =entity.getMobileNo();
			
			
			if (name != null && !name.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && name.length() >= 3
					&& name.length() < 40) {
				System.out.println("name is valid");
			} else {
				System.out.println("name is invalid");

			}
			if (photo !=null   && !photo.matches(".jpg,.png") && photo.length()>=3 && photo.length() < 40){
				System.out.println("photo is valid");
			} else {
				System.out.println("photo is invalid");

			}
			if (emailId!= null && !emailId.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*")) {
				System.out.println("emailId is valid");
			} else {
				System.out.println("emailId is invalid");

			}
			if (password!= null && !password.matches(".*[0-9,!@#$%^&*()_+{}><.;,<>].*") && password.length() >= 3
					&& password.length() < 40) {
				System.out.println("password is valid");
			} else {
				System.out.println("password is invalid");

			}
			if (mobileNo >= 3   && mobileNo < 12) {
				System.out.println("mobileNo is valid");
			} else {
				System.out.println("mobileNo is invalid");

			}
			
				ProfileEntity entity2 = new ProfileEntity();
				System.out.println("from entity 2"+entity2);
				BeanUtils.copyProperties(entity, entity2);
				dao.save(entity2);
				return true;
			}
		return false;
				}
	@Override
	public ProfileEntity findByEmailId(String emailId) {
		System.out.println("Running find the method from service");
		ProfileEntity entity=this.dao.findByEmailId(emailId);
		if(entity !=null) {
			ProfileEntity entity2=new ProfileEntity();
			BeanUtils.copyProperties(entity, entity2);
			return entity2;

		}
		return entity;
	}
	
	@Override
	public ProfileEntity findByEmailIdAndPassword(String emailId, String password,Model model) {
		System.out.println("Running find The Method 2 from Service");
		ProfileEntity entity=this.dao.findByEmailId(emailId);
		if(entity !=null && entity.getPassword().equals(password)) {
			ProfileEntity entity2 = this.dao.findByEmailIdAndPassword(emailId, password);
			System.out.println("Service working is successfully ");
			return entity2;
		}else {
			System.out.println("checking the password");
		
		}
               return ProfileService.super.findByEmailIdAndPassword(emailId, password, model);	
	}
//	@Override
//	public boolean UpdateProfileEntity(ProfileEntity eEntity) {
//		ProfileEntity entity2=new ProfileEntity();
//		BeanUtils.copyProperties(eEntity, entity2);
//			return this.dao.UpdateAllProfileEntityByEmailId(entity);
//		}
	@Override
	public List<Object> getAllUserInfo() {
		ArrayList<Object> listOfObjects=null;
		List<ProfileEntity> list = this.dao.getAllUserInfo();
		if (list!=null && !list.isEmpty() ) {
			listOfObjects = new ArrayList<>();
			for (ProfileEntity profileEntity : list) {
			listOfObjects.add(profileEntity);
			System.out.println("----"+profileEntity.toString());
			}
		}
		return listOfObjects;
	}
	
	@Override
	public ProfileEntity deleteById(int id) {
		System.out.println("delete query is working");
		ProfileEntity entity =this.dao.deleteById(id);
		return entity;
	}
}
