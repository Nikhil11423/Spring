package com.xworkz.user.service;

import org.springframework.stereotype.Service;

import com.xworkz.entity.UserEntity;
import com.xworkz.user.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository user;

	public UserServiceImpl(UserRepository repository) {
		super();
		this.user = repository;
	}

	@Override
	public UserEntity save(UserEntity entity) {
		System.out.println("Running Save Method From Service");
		user.save(entity);
		return entity;

	}
//		@Override
//		public List<UserEntity> getAllUserEntity() {
//			System.out.println("Running find all method from service");
//			return user.findAll();
//		}
//
//		@Override
//		public UserEntity getUserEntityById(long id) {
//			Optional<UserEntity> resort = user.findById(id);
//			if (resort.isPresent()) {
//			}
//			return resort.get();
//		}

//		@Override
//		public UserEntity updateUserEntity(UserEntity entity, long id) {
//			System.out.println("Running update method from service");
//
//			Object existingEntity = u.findById(id).orElseThrow();
//
//			existingEntity.setName(entity.getName());
//			existingEntity.setOwner(entity.getOwner());
//			existingEntity.setEntryfee(entity.getEntryfee());
//			existingEntity.setLocation(entity.getLocation());
//
//			user.save(existingEntity);
//			return user;
//		}

//		@Override
//		public void deletUserEntityById(long id) {
//			user.findById(id).orElseThrow();
//			user.deleteById(id);
//		
//			
//		}
//
//		@Override
//		public UserEntity updateUserEntity(UserEntity entity, long id) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//

}
