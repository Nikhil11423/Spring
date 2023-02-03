package com.xworkz.register.dao;




import java.util.List;

import com.xworkz.register.entity.ProfileEntity;



public interface ProfileDAO {

	public boolean save(ProfileEntity entity);
	
	ProfileEntity findByEmailId(String emailId);
	
	ProfileEntity findByEmailIdAndPassword(String emailId, String Password);

	public List<ProfileEntity> getAllUserInfo();
	
	ProfileEntity deleteById(int id);
    
}
	
