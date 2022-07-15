package com.xworkz.springfw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.springfw.bean.BrakeShoe;
import com.xworkz.springfw.bean.ChainSprocket;
import com.xworkz.springfw.bean.Engine;
import com.xworkz.springfw.bean.GearBox;
import com.xworkz.springfw.bean.HandleBarSwitch;
import com.xworkz.springfw.bean.HeadLight;
import com.xworkz.springfw.bean.Horn;
import com.xworkz.springfw.bean.Indicator;
import com.xworkz.springfw.bean.Mirror;
import com.xworkz.springfw.bean.Mudguard;
import com.xworkz.springfw.bean.NumberPlate;
import com.xworkz.springfw.bean.Regulator;
import com.xworkz.springfw.bean.Seat;
import com.xworkz.springfw.bean.SeatHandle;
import com.xworkz.springfw.bean.SpeedoMeter;
import com.xworkz.springfw.bean.Stand;
import com.xworkz.springfw.bean.Tyre;
import com.xworkz.springfw.bean.TyreHugger;

import lombok.Getter;

@Component
@Getter
public class Pulsar {

	@Value("bajaj")
	private String company;
	@Value("150cc")
	private String engineCC;
	@Value("65kms")
	private String milege;
	@Value("15v")
	private String power;
	@Value("95000.0")
	private double price;
	@Value("single")
	private String discType;
	@Value("petrol")
	private String fuelType;
	@Value("15ltr")
	private String fuelTankCpacity;
	@Value("84504.0")
	private double onRoadPrice;
	@Value("785mm")
	private String seatHeight;
	@Value("144 to 150kg")
	private String curbWeight;
	@Value("2055mm")
	private String overallLength;
	@Value("765mm")
	private String overallwidth;
	@Value("165mm")
	private String overallHeight;
	@Value("Double Cradle")
	private String chassisType;
	@Value("5")
	private int warrantyInYear;
	@Value("75000")
	private int warrantyInKm;
	@Value("true")
	private boolean odometer;
	@Value("true")
	private boolean drls;
	@Value("false")
	private boolean mobileAppConnectivity;
	@Value("false")
	private boolean usbChargingPort;
	@Value("true")
	private boolean speedoMeter;
	@Value("true")
	private boolean fuelGauge;
	@Value("Anologue")
	private String technoMeter;
	@Value("true")
	private boolean lowBatteryIndicator;
	@Autowired
	private Engine engine;
	@Autowired
	private Seat seat;
	@Autowired
	private Mirror mirror;
	@Autowired
	private Tyre tyre;
	@Autowired
	private GearBox gearBox;
	@Autowired
	private ChainSprocket chainSprocket;
	@Autowired
	private Stand stand;
	@Autowired
	private Horn horn;
	@Autowired
	private BrakeShoe brakeShoe;
	@Autowired
	private Mudguard mudguard;
	@Autowired
	private SeatHandle seatHandle;
	@Autowired
	private NumberPlate numberPlate;
	@Autowired
	private HandleBarSwitch handle;
	@Autowired
	private HeadLight headLight;
	@Autowired
	private Regulator regulator;
	@Autowired
	private SpeedoMeter meter;
	@Autowired
	private Indicator indicator;
	@Autowired
	private TyreHugger tyreHugger;

	public Pulsar() {
		System.out.println("creating pulsar default condtructor");
	}
	
	

	@Override
	public String toString() {
		return "Pulsar [company=" + company + ", engineCC=" + engineCC + ", milege=" + milege + ", power=" + power
				+ ", price=" + price + ", discType=" + discType + ", fuelType=" + fuelType + ", fuelTankCpacity="
				+ fuelTankCpacity + ", onRoadPrice=" + onRoadPrice + ", seatHeight=" + seatHeight + ", curbWeight="
				+ curbWeight + ", overallLength=" + overallLength + ", overallwidth=" + overallwidth
				+ ", overallHeight=" + overallHeight + ", chassisType=" + chassisType + ", warrantyInYear="
				+ warrantyInYear + ", warrantyInKm=" + warrantyInKm + ", odometer=" + odometer + ", drls=" + drls
				+ ", mobileAppConnectivity=" + mobileAppConnectivity + ", usbChargingPort=" + usbChargingPort
				+ ", speedoMeter=" + speedoMeter + ", fuelGauge=" + fuelGauge + ", technoMeter=" + technoMeter
				+ ", lowBatteryIndicator=" + lowBatteryIndicator + ", engine=" + engine + ", seat=" + seat + ", mirror="
				+ mirror + ", tyre=" + tyre + ", gearBox=" + gearBox + ", chainSprocket=" + chainSprocket + ", stand="
				+ stand + ", horn=" + horn + ", brakeShoe=" + brakeShoe + ", mudguard=" + mudguard + ", seatHandle="
				+ seatHandle + ", numberPlate=" + numberPlate + ", handle=" + handle + ", headLight=" + headLight
				+ ", regulator=" + regulator + ", meter=" + meter + ", indicator=" + indicator + ", tyreHugger="
				+ tyreHugger + "]";
	}

}
