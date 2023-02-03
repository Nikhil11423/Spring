package com.xworkz.user.service;

import org.springframework.stereotype.Service;

import com.xworkz.entity.UserEntity;

@Service
public interface UserService{

    UserEntity save(UserEntity entity);
// 	List<UserEntity> getAllUserEntity();
// 	UserEntity getUserEntityById(long id);
// 	UserEntity updateUserEntity(UserEntity entity,long id);
// 	void deletUserEntityById(long id);
}
