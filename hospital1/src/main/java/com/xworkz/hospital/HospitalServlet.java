package com.xworkz.hospital;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/register")
public class HospitalServlet extends HttpServlet{

		public HospitalServlet() {
			System.out.println("Create the hospital for tomcat");
		
	}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Invoking the Do Post Method");

			String firstname = req.getParameter("firstName");
			String lastname = req.getParameter("lastName");
			String email = req.getParameter("email");
			String age = req.getParameter("age");
			String date =req.getParameter("current date");
			String mobile = req.getParameter("mobile");
			String password = req.getParameter("password");
			String cpassword = req.getParameter("confirm password");

			resp.setContentType("text/html");
			String message = null;
			String fontcolor = "null";
			String message8 = "Out Patient register is failure";
			String fontColor = null;
			if (firstname != null && !firstname.isEmpty() && firstname.length() > 3) {
				fontColor = "#ff0047";
				message = "Full Name :" + firstname + " " + lastname;
			} else {
				message = "Please enter first name";
				String html1 = "<html><style>body{background-image : url(\"wallpaperflare.com_wallpaper.jpg\");: ;font-size:130%;}</style>"
						+ "<body><h1 style=\"color: red\">" + message8 + "</br> </br> " + message + "</h1></body></html>";
				PrintWriter writer = resp.getWriter();
				writer.write(html1);
				writer.close();
			}
			
			String message1 = null;
			if(date !=null && !date.isEmpty()) {
				fontcolor = "green";
				message1 = "Current Date=" +date;
			} else {
				message1 = "Select Current date";
				//fontcolor = "red";
				String html1 = "<html><style>body{background-image : url(\"wallpaperflare.com_wallpaper.jpg\");: ;font-size:130%;}</style>"
						+ "<body><h1 style=\"color: red\">" + message8 + "</br> </br> " + message1 + "</h1></body></html>";
				PrintWriter writer = resp.getWriter();
				writer.write(html1);
				writer.close();
			}
			String message2 = null;
			if (lastname != null && !lastname.isEmpty() && lastname.length()>3) {
				fontcolor = "green";
			} else {
				message2 = "Please enter last name";
				//fontcolor = "red";
				String html1 = "<html><style>body{background-image : url(\"wallpaperflare.com_wallpaper.jpg\");: ;font-size:130%;}</style>"
						+ "<body><h1 style=\"color: red\">" + message8 + "</br> </br> " + message2 + "</h1></body></html>";
				PrintWriter writer = resp.getWriter();
				writer.write(html1);
				writer.close();
			}
			String message3 = null;
			if (email != null && email.length() >= 8 && email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
				fontcolor = "green";
				message3 = "Email:" +email;
			} else {
				message3 = "Please Enter Email Id";
				//fontcolor = "red";
				String html1 = "<html><style>body{background-image : url(\"wallpaperflare.com_wallpaper.jpg\");: ;font-size:130%;}</style>"
						+ "<body><h1 style=\"color: red\">" + message8 + "</br> </br> " + message3 + "</h1></body></html>";
				PrintWriter writer = resp.getWriter();
				writer.write(html1);
				writer.close();
			}
			String message4 = null;
			if (age != null && !age.isEmpty()) {
				fontcolor = "green";
				message4 = "Age :" +age;
			} else {
				message4 = "Please Enter Age";
				fontcolor =  "red";
				String html1 = "<html><style>body{background-image : url(\"wallpaperflare.com_wallpaper.jpg\");: ;font-size:130%;}</style>"
						+ "<body><h1 style=\"color: red\">" + message8 + "</br> </br> " + message4 + "</h1></body></html>";
				PrintWriter writer = resp.getWriter();
				writer.write(html1);
				writer.close();
			}
				
			String message5 = null;
			if (mobile != null && !mobile.isEmpty() && mobile.length()>9) {
				fontcolor = "green";
				message5 = "mobile="+mobile;
			} else {
				message5 = "Please Enter mobile Number";
				//fontcolor = "red";
				String html1 = "<html><style>body{background-image : url(\"wallpaperflare.com_wallpaper.jpg\");: ;font-size:130%;}</style>"
						+ "<body><h1 style=\"color: red\">" + message8 + "</br> </br> " + message5 + "</h1></body></html>";
				PrintWriter writer = resp.getWriter();
				writer.write(html1);
				writer.close();
			}
			String message6 = null;
			if (password != null && !password.isEmpty() && password.length()>6 && password.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+")) {
				fontcolor = "green";
				message6 = "password:"+password;
			} else {
				message6 = "Please Enter password";
				String html1 = "<html><style>body{background-image : url(\"wallpaperflare.com_wallpaper.jpg\");: ;font-size:130%;}</style>"
						+ "<body><h1 style=\"color: red\">" + message8 + "</br> </br> " + message6 + "</h1></body></html>";
				PrintWriter writer = resp.getWriter();
				writer.write(html1);
				writer.close();
			}
			String message7 = null;
			if (cpassword != null && !cpassword.isEmpty() && cpassword.length()>6 && cpassword.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+")) {
				fontcolor = "green";
				message7 = "cpassword:"+cpassword;
			} else {
				message7 = "Please Enter ConfirmPassword";
				String html1 = "<html><style>body{background-image : url(\"wallpaperflare.com_wallpaper.jpg\");: ;font-size:130%;}</style>"
						+ "<body><h1 style=\"color: red\">" + message8 + "</br> </br> " + message7 + "</h1></body></html>";
				PrintWriter writer = resp.getWriter();
				writer.write(html1);
				writer.close();
			}
			

			String html = "<html><bod><h1>Out Patient Register is Successful</h1>"+"</br>"
					+"<p>Below are the Details</p>"
					+"</br>"
					+"---------------------------------------------------------------"
					+"</br>"
					+"<h1 style= color:"+fontcolor+">"
					+" "+message+""+"</br>"   
					+" "+message1+""+"</br>"
					+" "+message3+""+"</br>"
					+" "+message4+""+"</br>"
					+"</h1></body></html>";
				
			PrintWriter writer = resp.getWriter();
			writer.write(html);
			writer.close();

			System.out.println(firstname + " " + lastname + " " + email + " " + age + " " + mobile + " " + date + " " + password + " "
					+ cpassword);
		}
	}

