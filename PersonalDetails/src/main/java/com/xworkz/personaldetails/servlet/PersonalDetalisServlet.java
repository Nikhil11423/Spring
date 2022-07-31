package com.xworkz.personaldetails.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/nikhil")
public class PersonalDetalisServlet extends HttpServlet {

	public PersonalDetalisServlet() {
		System.out.println("Create the personaldetails from tomcat");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking the Doget methods");
		
		String firstName=req.getParameter("firstName");
		String secondName=req.getParameter("secondName");
		String lastName=req.getParameter("lastName");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
		String maritalStatus=req.getParameter("maritalStatus");
		String bloodGroup=req.getParameter("bloodGroup");
		String mobileNo=req.getParameter("mobileNo");
		String email=req.getParameter("email");
		String dream=req.getParameter("dream");
		String fatherName=req.getParameter("fatherName");
		String motherName=req.getParameter("motherName");
		String sisterName=req.getParameter("sisterName");
		String height=req.getParameter("height");
		String weight=req.getParameter("weight");
		String dob=req.getParameter("dob");
		String birthPlace=req.getParameter("birthPlace");
		String skinColor=req.getParameter("skinColor");
		String hairType=req.getParameter("hairType");
		String disability=req.getParameter("disability");
		String footsize=req.getParameter("footsize");
		String birthTime=req.getParameter("birthTime");
		String primarySchoolName=req.getParameter("primarySchoolName");
		String favouriteTeacherName=req.getParameter("favouriteTeacherName");
		String favouriteSubject=req.getParameter("favouriteSubject");
		String highSchoolName=req.getParameter("highSchoolName");
		String percenteg=req.getParameter("percenteg");
		String yearOfPassing=req.getParameter("yearOfPassing");
		String pucCollegeName=req.getParameter("pucCollegeName");
		String PUCpercenteg=req.getParameter("PUCpercenteg");
		String PUCyearOfPassing=req.getParameter("PUCyearOfPassing");
		String bscCollegeName=req.getParameter("bscCollegeName");
		String BSCpercenteg=req.getParameter("BSCpercenteg");
		String BSCyearOfPassing=req.getParameter("BSCyearOfPassing");
		String mscCollegeName=req.getParameter("mscCollegeName");
		String MSCpercenteg=req.getParameter("MSCpercenteg");
		String MSCyearOfPassing=req.getParameter("MSCyearOfPassing");
		String favouriteLecturerName=req.getParameter("favouriteLecturerName");
		String favouriteSports=req.getParameter("favouriteSports");
		String favouriteNumber=req.getParameter("favouriteNumber");
		String favouriteFood=req.getParameter("favouriteFood");
		String favouriteSongKannada=req.getParameter("favouriteSongKannada");
		String favouriteSongMarathi=req.getParameter("favouriteSongMarathi");
		String favouriteMovie=req.getParameter("favouriteMovie");
		String favouriteActor=req.getParameter("favouriteActor");
		String favouriteHeroine=req.getParameter("favouriteHeroine");
		String favouriteSingerKannada=req.getParameter("favouriteSingerKannada");
		String favouriteSingerMarathi=req.getParameter("favouriteSingerMarathi");
		String favouriteCricketer=req.getParameter("favouriteCricketer");
		String favouriteTeam=req.getParameter("favouriteTeam");
		String favouriteIPLTeam=req.getParameter("favouriteIPLTeam");
		String favouriteKabaddiPlayer=req.getParameter("favouriteKabaddiPlayer");
		String favouriteAthletics=req.getParameter("favouriteAthletics");
		String favouriteColor=req.getParameter("favouriteColor");
		String favouriteLanguage=req.getParameter("favouriteLanguage");
		String favouriteBook=req.getParameter("favouriteBook");
		String favouriteCity=req.getParameter("favouriteCity");
		String favouriteGod=req.getParameter("favouriteGod");
		String favouritePlace=req.getParameter("favouritePlace");
		String favouriteBike=req.getParameter("favouriteBike");
		String favouriteCar=req.getParameter("favouriteCar");
		String roleModel=req.getParameter("roleModel");
		String myStrength=req.getParameter("myStrength");
		String weakness=req.getParameter("weakness");
		String bestFrndName=req.getParameter("bestFrndName");
		String myGuruName=req.getParameter("myGuruName");
		String awardInUG=req.getParameter("awardInUG");
		String awardInPG=req.getParameter("awardInPG");
		String kabaddi=req.getParameter("kabaddi");
		String crushName=req.getParameter("crushName");
		String aadharNo=req.getParameter("aadharNo");
		String panNo=req.getParameter("panNo");
		String DLNo=req.getParameter("DLNo");
		String voterId=req.getParameter("voterId");
		String wardNo=req.getParameter("wardNo");
		String permnetAddress=req.getParameter("permnetAddress");
		String AreaName=req.getParameter("AreaName");
		String HouseNo=req.getParameter("HouseNo");
		String villege=req.getParameter("villege");
		String taluk=req.getParameter("taluk");
		String district=req.getParameter("district");
		String state=req.getParameter("state");
		String country=req.getParameter("country");
		String pincode=req.getParameter("pincode");
		String postoffice=req.getParameter("postoffice");
		String areaPoliceStation=req.getParameter("areaPoliceStation");
		String hobali=req.getParameter("hobali");
		String currentAddress=req.getParameter("currentAddress");
		String countryCode=req.getParameter("countryCode");
		String noOfFamilyMembers=req.getParameter("noOfFamilyMembers");
		String LoverName=req.getParameter("LoverName");
		String presentLover=req.getParameter("presentLover");
		String favouriteNationalParty=req.getParameter("favouriteNationalParty");
		String favouriteLeader=req.getParameter("favouriteLeader");
		String favouriteCountry=req.getParameter("favouriteCountry");

		System.out.println(firstName +" "+ secondName  +" "+ lastName +" "+ age +" "+ gender +" "+ maritalStatus +" "+ bloodGroup +" "+ mobileNo +" "+ email +" "+  dream 
				+" "+ fatherName +" "+ motherName +" "+ sisterName  +" "+ height +" "+ weight +" "+ dob + " "+ birthPlace +" "+ skinColor +" "+ hairType +" "+ disability +" "+ footsize +" "+ birthTime +" "+
				primarySchoolName +" "+  primarySchoolName +" "+ favouriteSubject +" "+ highSchoolName +" "+ percenteg +" "+ yearOfPassing +" "+ pucCollegeName +" "+ PUCpercenteg +" "+ PUCyearOfPassing  +" "+
				bscCollegeName+" "+BSCpercenteg +" "+ BSCyearOfPassing+" "+ mscCollegeName+" "+ MSCpercenteg+" "+ MSCyearOfPassing  +" "+ favouriteLecturerName +" "+ favouriteSports +" "+favouriteNumber  +" "+
				favouriteFood+" "+ favouriteSongKannada  +" "+ favouriteSongMarathi   +" "+ favouriteMovie +" "+ favouriteActor+" "+ favouriteHeroine+" "+ favouriteSingerKannada+" "+ favouriteSingerMarathi +" "+
				favouriteCricketer +" "+ favouriteTeam +" "+ favouriteIPLTeam +" "+ favouriteKabaddiPlayer+" "+favouriteAthletics+" "+ favouriteColor+" "+ favouriteLanguage +" "+favouriteBook+" "+ favouriteCity+" "+ favouriteGod+" "+ favouritePlace+" "+ favouriteBike+" "+
				favouriteCar+" "+ roleModel+" "+ myStrength +" "+ weakness + " "+ bestFrndName +" "+myGuruName +" "+ awardInUG+" "+ awardInPG+" "+
				kabaddi+" "+ crushName+" "+ aadharNo +" "+ panNo  +" "+DLNo +" "+ voterId+" "+ wardNo+" "+ permnetAddress+" "+ AreaName+" "+
				HouseNo +" "+ villege +" "+ taluk +" "+ district +" "+ state +" "+ country +" "+ pincode +" "+  postoffice+" "+
				areaPoliceStation +" "+ hobali +" "+ currentAddress  +" "+ countryCode +" "+ noOfFamilyMembers+" "+ LoverName+" "+ presentLover+" "+ favouriteNationalParty+" "+
				favouriteLeader+" "+ favouriteCountry);
	
		super.doGet(req, resp);
	}
	

}

