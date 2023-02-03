package com.xworkz.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.registration.dao.RegistrationDAO;
import com.xworkz.registration.dao.RegistrationDAOImpl;
import com.xworkz.registration.dto.RegistrationDTO;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

	private RegistrationDAO dao = new RegistrationDAOImpl();
	
	public RegistrationServlet() {
		System.out.println("Servlet is running");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		String firstName = request.getParameter("firstName");
		String midelName = request.getParameter("midelName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirm = request.getParameter("confirmPassword");

		RegistrationDTO dto = new RegistrationDTO();
		dto.setFirstName(request.getParameter("firstName"));
		dto.setMidelName(request.getParameter("midelName"));
		dto.setLastName(request.getParameter("lastName"));
		dto.setEmail(request.getParameter("email"));
		dto.setPassword(request.getParameter("password"));
		dto.setConfirmPassword(request.getParameter("confirmPassword"));

		dao.save(dto);
	}
}
