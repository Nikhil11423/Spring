package com.xworkz.registration.dto;

import java.io.Serializable;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.xworkz.registration.dao.RegistrationDAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationDTO implements Serializable {

	private int id;
	private String firstName;
	private String midelName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	
	
}
