package com.xworkz.springframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springframework.bean.ActorBean;
import com.xworkz.springframework.bean.ApartmentBean;
import com.xworkz.springframework.bean.AppuMoviesBean;
import com.xworkz.springframework.bean.BottleBean;
import com.xworkz.springframework.bean.CandyBean;
import com.xworkz.springframework.bean.CapacitorBean;
import com.xworkz.springframework.bean.CityBean;
import com.xworkz.springframework.bean.CollegeBean;
import com.xworkz.springframework.bean.CompanyBean;
import com.xworkz.springframework.bean.CountryBean;
import com.xworkz.springframework.bean.CustomerBean;
import com.xworkz.springframework.bean.DarshanMoviesBean;
import com.xworkz.springframework.bean.EarPhoneBean;
import com.xworkz.springframework.bean.HeadphoneBean;
import com.xworkz.springframework.bean.HospitalBean;
import com.xworkz.springframework.bean.InductorBean;
import com.xworkz.springframework.bean.KannadaActorsBean;
import com.xworkz.springframework.bean.LoptopBean;
import com.xworkz.springframework.bean.MobileBean;
import com.xworkz.springframework.bean.MotorBean;
import com.xworkz.springframework.bean.MovieBean;
import com.xworkz.springframework.bean.PgBean;
import com.xworkz.springframework.bean.SongBean;
import com.xworkz.springframework.bean.StateDetailsBean;
import com.xworkz.springframework.bean.StudentBean;
import com.xworkz.springframework.bean.WaterBottleBean;
import com.xworkz.springframework.configure.SpringConfigure;

public class StudentRunner {

	public static void main(String[] val) {

		System.out.println("=========================15 class using Component annotation=============");
		ApplicationContext container = new AnnotationConfigApplicationContext(ActorBean.class);
		ActorBean bean = container.getBean(ActorBean.class);
		System.out.println(bean);

		ApplicationContext container2 = new AnnotationConfigApplicationContext(AppuMoviesBean.class);
		System.out.println(container2.getBean(AppuMoviesBean.class));

		ApplicationContext container3 = new AnnotationConfigApplicationContext(CandyBean.class);
		System.out.println(container3.getBean(CandyBean.class));

		ApplicationContext container4 = new AnnotationConfigApplicationContext(MotorBean.class);
		System.out.println(container4.getBean(MotorBean.class));

		ApplicationContext container5 = new AnnotationConfigApplicationContext(MovieBean.class);
		System.out.println(container5.getBean(MovieBean.class));

		ApplicationContext container6 = new AnnotationConfigApplicationContext(ApartmentBean.class);
		System.out.println(container6.getBean(ApartmentBean.class));

		ApplicationContext container7 = new AnnotationConfigApplicationContext(CountryBean.class);
		System.out.println(container7.getBean(CountryBean.class));

		ApplicationContext container8 = new AnnotationConfigApplicationContext(CustomerBean.class);
		System.out.println(container8.getBean(CustomerBean.class));

		ApplicationContext container9 = new AnnotationConfigApplicationContext(HeadphoneBean.class);
		System.out.println(container9.getBean(HeadphoneBean.class));

		ApplicationContext container10 = new AnnotationConfigApplicationContext(MobileBean.class);
		System.out.println(container10.getBean(MobileBean.class));

		ApplicationContext container11 = new AnnotationConfigApplicationContext(StateDetailsBean.class);
		System.out.println(container11.getBean(StateDetailsBean.class));

		ApplicationContext container12 = new AnnotationConfigApplicationContext(StudentBean.class);
		System.out.println(container12.getBean(StudentBean.class));

		ApplicationContext container13 = new AnnotationConfigApplicationContext(CapacitorBean.class);
		System.out.println(container13.getBean(CapacitorBean.class));

		//ApplicationContext container14 = new AnnotationConfigApplicationContext(PgBean.class);
		//System.out.println(container14.getBean(PgBean.class));

		ApplicationContext container15 = new AnnotationConfigApplicationContext(HospitalBean.class);
		System.out.println(container15.getBean(HospitalBean.class));

		ApplicationContext container16 = new AnnotationConfigApplicationContext(WaterBottleBean.class);
		System.out.println(container16.getBean(WaterBottleBean.class));

		System.out.println("===================10 class using configuration bean annotation==========");
		ApplicationContext container1 = new AnnotationConfigApplicationContext(SpringConfigure.class);

		SongBean song = container1.getBean(SongBean.class);
		System.out.println(song);

		CompanyBean company = container1.getBean(CompanyBean.class);
		System.out.println(company);

		DarshanMoviesBean movies = container1.getBean(DarshanMoviesBean.class);
		System.out.println(movies);

		KannadaActorsBean actor = container1.getBean(KannadaActorsBean.class);
		System.out.println(actor);

		EarPhoneBean phone = container1.getBean(EarPhoneBean.class);
		System.out.println(phone);

		BottleBean bottle = container1.getBean(BottleBean.class);
		System.out.println(bottle);

		CityBean city = container1.getBean(CityBean.class);
		System.out.println(city);

		InductorBean inductor = container1.getBean(InductorBean.class);
		System.out.println(inductor);

		LoptopBean laptop = container1.getBean(LoptopBean.class);
		System.out.println(laptop);

		CollegeBean college = container1.getBean(CollegeBean.class);
		System.out.println(college);

		System.out.println("==========================Non premitive data type using bean configuration===============");
		String string = container1.getBean(String.class);
		System.out.println("the value of string is:- " + string);

		ArrayList<String> array = container1.getBean(ArrayList.class);
		System.out.println("the value of ArrayList is:- " + array);

		Integer integer = container1.getBean(Integer.class);
		System.out.println("the value of Integer is:- " + integer);

		Double double1 = container1.getBean(Double.class);
		System.out.println("the value of Double is:- " + double1);

		HashMap<String, String> hash = container1.getBean(HashMap.class);
		System.out.println("the value of HashMap is:- " + hash);

		HashSet<String> set = container1.getBean(HashSet.class);
		System.out.println("the value of HashSet is:- " + set);

		LinkedList<String> linked = container1.getBean(LinkedList.class);
		System.out.println("the value of LinkedList is:- " + linked);

		Character cha = container1.getBean(Character.class);
		System.out.println("the value of Character is:- " + cha);

		Boolean bool = container1.getBean(Boolean.class);
		System.out.println("the value of Boolean is:- " + bool);

		Long lon = container1.getBean(Long.class);
		System.out.println("the value of Long is:- " + lon);

		Float flo = container1.getBean(Float.class);
		System.out.println("the value of Float is:- " + flo);

		Short sho = container1.getBean(Short.class);
		System.out.println("the value of Short is:- " + sho);

	}
}