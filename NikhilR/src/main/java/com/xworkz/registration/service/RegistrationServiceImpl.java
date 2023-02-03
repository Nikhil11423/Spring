package com.xworkz.registration.service;

import com.xworkz.exception.InvalidDataException;
import com.xworkz.registration.dao.RegistrationDAO;
import com.xworkz.registration.dao.RegistrationDAOImpl;
import com.xworkz.registration.dto.RegistrationDTO;

public class RegistrationServiceImpl implements RegistrationService {

	
	private RegistrationDAO dao ;
	
	
	@Override
	public boolean validateAndSave(RegistrationDTO dto) throws InvalidDataException{

		
		if (dto != null) {
			int id = dto.getId();
			String fname = dto.getFirstName();
			String mname = dto.getMidelName();
			String lname = dto.getLastName();
			String email = dto.getEmail();
			String password = dto.getPassword();

		if (fname != null && !fname.matches(".[0-9,!@#$%^&()_+{}><.;,<>].*") && fname.length() >= 2
				&& fname.length() < 30) {
			System.out.println("name is valid");
		} else {
			throw new InvalidDataException("name is invalid");

		}

		if (mname != null && !mname.matches(".[0-9,!@#$%^&()_+{}><.;,<>].*") && mname.length() >= 2
				&& mname.length() < 30) {
			System.out.println("mname is valid");
		} else {
			throw new InvalidDataException("mname is invalid");
	}

	if (lname != null && !lname.matches(".[0-9,!@#$%^&()_+{}><.;,<>].*") && lname.length() >= 2
			&& lname.length() < 30) {
		System.out.println("lname is valid");
	} else {
		throw new InvalidDataException("lname is invalid");
	}
	if (email != null && !email.matches(".[0-9,!@#$%^&()_+{}><.;,<>].*")) {
		System.out.println("email is valid");
	} else {
		throw new InvalidDataException("email is invalid");
	}
	if (password != null && !password.matches(".[0-9,!@#$%^&()_+{}><.;,<>].*") && password.length() >= 6
			&& mname.length() < 8) {
		System.out.println("password is valid");
	} else {
		throw new InvalidDataException("password is invalid");

	}
		}
		return this.dao.save(dto);
	}
}