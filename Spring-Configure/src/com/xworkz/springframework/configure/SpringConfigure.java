package com.xworkz.springframework.configure;

	import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springframework.bean.ActorBean;
import com.xworkz.springframework.bean.BottleBean;
import com.xworkz.springframework.bean.CapacitorBean;
import com.xworkz.springframework.bean.CityBean;
import com.xworkz.springframework.bean.CollegeBean;
import com.xworkz.springframework.bean.CompanyBean;
import com.xworkz.springframework.bean.CountryBean;
import com.xworkz.springframework.bean.DarshanMoviesBean;
import com.xworkz.springframework.bean.EarPhoneBean;
import com.xworkz.springframework.bean.InductorBean;
import com.xworkz.springframework.bean.KannadaActorsBean;
import com.xworkz.springframework.bean.LoptopBean;
import com.xworkz.springframework.bean.SongBean;
import com.xworkz.springframework.bean.StudentBean;

import lombok.Getter;
	@Configuration
	@ComponentScan(basePackages = "com.xworkz.springframework")
	@Getter
	public class SpringConfigure {
		@Bean
		public CompanyBean companyBean() {
			CompanyBean company = new CompanyBean();
			company.setCeo("Nikhil");
			company.setChairman("Srinath");
			company.setIncomeInCr(125645);
			company.setLocation("Borgaon");
			company.setMd("Suraj");
			company.setName("xworkzsdc");
			company.setNoOfDirectors(25);
			company.setNoOfEmployees(150);
		    company.setPresident("Kiran");
		    company.setProfitFor2019InCr(9589675);
		    company.setProfitFor2020InCr(84654654);
		    company.setProfitFor2021InCr(45897);
		    company.setProfitFor2022InCr(878787987);
		    company.setRevenueIncr(887787);
			
			return company;

		}

		@Bean
		public SongBean songBean() {
			SongBean bean = new SongBean();
			bean.setId(143);
			bean.setSongName("Mugaru male");
			bean.setCategory("horror");
			bean.setHeroineName("Pooja Gandhi");
			bean.setHeroName("Ganesh");
			bean.setLang("Kannada");
			bean.setLyricistName("Jaynth Kaikini");
			bean.setMovieName("Mugaru male");
			bean.setMusicDirector("Mano Murthy");
			bean.setMusicLabel("dasdasd");
			bean.setSingerName("Shreya Ghoshal");
			bean.setSongName("Harsha");
			bean.setType("Love");
			bean.setUploadedBy("Kannada Movie junction");
			
			return bean;
		}
		
		@Bean
		public  KannadaActorsBean kannadaActorsBean(){
			KannadaActorsBean kannadaActorBean=new KannadaActorsBean();
			kannadaActorBean.setName("Punit Rajkumar");;
			kannadaActorBean.setGender("Male");
			kannadaActorBean.setAddress("Bangalore");
			kannadaActorBean.setQualification("bcom");
			kannadaActorBean.setMarried(true);
			kannadaActorBean.setLover(false);
			kannadaActorBean.setId(1);
			kannadaActorBean.setBirthYear(1985);
			kannadaActorBean.setHeight(5);
			kannadaActorBean.setWeight(78);
			kannadaActorBean.setAge(46);
			kannadaActorBean.setNoOfKids(2);
			kannadaActorBean.setNoOfAwards(15);
			kannadaActorBean.setNoOfMovies(42);
			
			return kannadaActorBean;
			
		}
		@Bean
		public DarshanMoviesBean darshanMoviesBean() {
			DarshanMoviesBean movie=new DarshanMoviesBean();
			movie.setFirstMovie("Majestic");
			movie.setFirstMovieHeroinName("Rekha");
			movie.setFirstMovieDirector("P. N. Sathya");
			movie.setFirstMovieMusicDirector("Sadhu Kokila");
			movie.setSecondMovie("Dhruva");
			movie.setSecondMovieHeroinName("Sherin");
			movie.setSecondMovieDirector("M. S. Ramesh");
			movie.setSecondMovieMusicDirector("	Gurukiran");
			movie.setThirdMovie("Ninagoskara");
			movie.setThirdMovieHeroinName("Bhavna Pani");
			movie.setThirdMovieDirector("Yogish Hunsur");
			movie.setThirdMovieMusicDirector("L. N. Shastri");
			movie.setLastMovie("Roberrt");
			movie.setLastMovieHeroinName("Asha Bhat");
			movie.setLastMovieDirector("Tharun Sudhir");
			movie.setLastMovieMusicDirector("V. Harikrishna");
			return movie;
		}
		
		@Bean
		public EarPhoneBean earPhoneBean() {
			EarPhoneBean ear=new EarPhoneBean();
			ear.setBatterylife(8.5);
			ear.setChargingTime(2.5);
			ear.setColor("black");
			ear.setCompanyName("sony");
			ear.setConnectivity("wired");
			ear.setDeepBass(false);
			ear.setModelName("n123d");
			ear.setPrice(399d);
			ear.setRating(3.5);
			ear.setSoundQuality("average");
			ear.setType("wired");
			ear.setWarranty(2.0);
			ear.setWaterResistant(false);
			ear.setWirelessRange(0);
			ear.setWieghtInGms(50);
			return ear;
			
		}
		@Bean CityBean cityBean() {
			CityBean cityBean=new CityBean();
			cityBean.setName("Borgaon");
			cityBean.setHobli("BDk");
			cityBean.setChairman("Nikhil");
			cityBean.setVoiceChairman("Suraj");
			cityBean.setTaluk("Nipani");
			cityBean.setDist("Belagavi");
			cityBean.setPdoName("Akhil");
			cityBean.setPincode(591216);
			cityBean.setPolicestation("Sadalaga");
			cityBean.setMlaName("Shashikala Jolle");
			cityBean.setMpName("Annasaheb Jolle");
			cityBean.setPostOffice(true);
			cityBean.setGovtHospital(true);
			cityBean.setTotalPanchaytimembers(17);
			cityBean.setCircleOffice("Nipani");
			return cityBean;
			
	
			
		}
		@Bean 
		public LoptopBean loptopBean() {
			LoptopBean loptop=new LoptopBean();
			loptop.setName("Acer");
			loptop.setBrand("acer12");
			loptop.setRam(4);
			loptop.setMemory(500);
			loptop.setPrice(35000.0);
			loptop.setWarranty(2.5d);
			loptop.setBatteryWarranty(1.2d);
			loptop.setDisplaySize(3.5f);
			loptop.setCamera(true);
			loptop.setModelNo("Aspire 5750s" );
			loptop.setProcessor(5);
			loptop.setStorageType("SSD");
			loptop.setAudioFeatures(true);
			loptop.setKeyboard("full-size");
			loptop.setBatteryWeight(175d);
			return loptop;
		}
		@Bean
		public CollegeBean collegeBean() {
			CollegeBean college =new CollegeBean();
			college.setName("RCUB");
			college.setTotalDepartment(19);
			college.setPhoNo(567890);
			college.setPrincipalName("Shivanand Ghornale");
			college.setEmail("rucb@gmail.com");
			college.setCoordinaterName("Mallamma Reddy");
			college.setAddress("Belagavi");
			college.setTalukName("Belagavi");
			college.setDistName("Belagavi");
			college.setGsName("Nikhil");
			college.setLsName("Varsha");
			college.setTotalBoys(700);
			college.setTotalGirls(900);
			college.setGrade(true);
			college.setEqucationQuality("Good");
			return college;
			
		}
		@Bean
		public InductorBean inductorBean() {
			InductorBean inductor=new InductorBean();
			inductor.setBaseProductNumber("12asd5");
			inductor.setFailureRate(20.0);
			inductor.setFeatures("High readability");
			inductor.setMountingType("series");
			inductor.setPackage("cvb");
			inductor.setQuantity(2);
			inductor.setRohs(true);
			inductor.setSeries("erg");
			inductor.setStatus("good");
			inductor.setTemperature("32.2");
			inductor.setType("inductor");
			inductor.setUsedIn("pcb");
			inductor.setValue("20sd");
			return inductor;
			
		}
		@Bean
		public BottleBean bottleBean() {
			BottleBean bottle=new BottleBean();
			bottle.setBestBeforeInMonths(6);
			bottle.setBottleCap(true);
			bottle.setBottleType("cylinder");
			bottle.setBrand("Kinley");
			bottle.setBrandFounder("dont know");
			bottle.setCapColor("dark blue");
			bottle.setEstablished(1985);
			bottle.setFilterWater(true);
			bottle.setIsi(true);
			bottle.setMeterialType("plastic");
			bottle.setPrice(20.0);
			bottle.setQuality(true);
			bottle.setQuantity(1);
			bottle.setRating(4.5);
			return bottle;
			
		}
		
		
		

		@Bean
		public String string() {
			String string = new String("name");
			return string;

		}

		@Bean
		public ArrayList<String> arrayList() {
			ArrayList<String> list = new ArrayList<String>();
			list.add("Nikhil");
			list.add("Srinath");
			list.add("Suraj");

			return list;

		}

		@Bean
		public Integer integer() {
			Integer inte = new Integer(20);
			return inte;
		}

		@Bean
		public Double dob() {
			Double dobl = new Double(55.5);
			return dobl;
		}

		@Bean
		public HashMap<String, String> hashMap() {

			HashMap<String, String> hashmap1 = new HashMap<String, String>();
			hashmap1.put("name", "Nikhil");
			hashmap1.put("qualification", "MSc C.S");
			return hashmap1;

		}

		@Bean
		public HashSet<String> hash() {
			HashSet<String> map = new HashSet<String>();
			map.add("Nikhil");
			map.add("Srinath");
			return map;

		}

		@Bean
		public LinkedList<String> linkedList() {
			LinkedList<String> linkedList = new LinkedList<>();
			linkedList.add("A");
			linkedList.add("B");
			linkedList.add("C");
			return linkedList;

		}

		@Bean
		public Character charat() {
			Character rat = new Character('A');
			return rat;

		}

		@Bean
		public Boolean bool() {
			Boolean boo = new Boolean(true);
			return boo;
		}

		@Bean
		public Long longg() {
			Long long1 = new Long(1234655422);
			return long1;
		}

		@Bean
		public Float flo() {
			Float flo = new Float(52.5);
			return flo;
		}

		@Bean
		public Short sho() {
			Short shor = new Short("454");
			return shor;
		}

		

	}
