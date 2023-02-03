package com.xworkz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.entity.UserEntity;
import com.xworkz.user.service.UserService;

@RestController
@RequestMapping("/boot")
public class TestController {


	private UserService service;

	public TestController(UserService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<UserEntity> save(@RequestBody UserEntity entity) {
		return new ResponseEntity<UserEntity>(service.save(entity), HttpStatus.CREATED);

	}

//	@GetMapping
//	public List<UserEntity> getAllUserEntity() {
//		return service.getAllUserEntity();
//
//	}
//	@GetMapping("{id}")
//	public ResponseEntity<UserEntity> getUSerEntityById(@PathVariable("id") long USerid){
//		return new ResponseEntity<UserEntity>(service.getUserEntityById(USerid),HttpStatus.OK);	
//	}
//	@PutMapping("{id}")
//	public ResponseEntity<UserEntity> updateUSerEntity(@PathVariable("id") long id,@RequestBody UserEntity resort){
//		return new ResponseEntity<UserEntity>(service.updateUserEntity(resort, id),HttpStatus.OK);	
//		
//	}
//	@DeleteMapping("{id}")
//	public ResponseEntity<String> deletUSerEntityById(@PathVariable("id") long id){
//		service.deletUserEntityById(id);
//		return new ResponseEntity<String>("Deleted SucessFully",HttpStatus.OK);	
//		
//	}
	
}
