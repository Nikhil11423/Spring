package com.xworkz.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xworkz.entity.UserEntity;


public interface UserRepository extends  JpaRepository<UserEntity,Long> {
	
}