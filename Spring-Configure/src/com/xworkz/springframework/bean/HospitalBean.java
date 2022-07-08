package com.xworkz.springframework.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@ComponentScan(basePackages = "com.xworkz.springframework")
@Component
@Getter
@Setter
public class HospitalBean {

	
	private Integer id;
	private String hospitalName;
	private String founderName;
	private long   phoneNo;
	private int totalstaff;
	private int totalBeds;
	private String doctorName;
	private boolean electricMedicalRecords;
	private boolean patientCare;
	private boolean nursingDept;
	private boolean nursingSupervisors;
	private int operationTheatre;
	private boolean laboratory;
	private boolean ayurvedic;
	private boolean patientHelpdesk;
	
	public HospitalBean(@Value("1") Integer id,
			@Value("Diya")String hospitalName, 
			@Value("Nikhil")String founderName,
			@Value("08383454")long phoneNo, 
			@Value("45")int totalstaff,
			@Value("100")int totalBeds, 
			@Value("arun")String doctorName,
			@Value("true")boolean electricMedicalRecords,
			@Value("false")boolean patientCare, 
			@Value("true")boolean nursingDept,
			@Value("true")boolean nursingSupervisors, 
			@Value("2")int operationTheatre,
			@Value("true")boolean laboratory, 
			@Value("false")boolean ayurvedic,
			@Value("true")boolean patientHelpdesk) {
		super();
		this.id = id;
		this.hospitalName = hospitalName;
		this.founderName = founderName;
		this.phoneNo = phoneNo;
		this.totalstaff = totalstaff;
		this.totalBeds = totalBeds;
		this.doctorName = doctorName;
		this.electricMedicalRecords = electricMedicalRecords;
		this.patientCare = patientCare;
		this.nursingDept = nursingDept;
		this.nursingSupervisors = nursingSupervisors;
		this.operationTheatre = operationTheatre;
		this.laboratory = laboratory;
		this.ayurvedic = ayurvedic;
		this.patientHelpdesk = patientHelpdesk;
	}
	@Override
	public String toString() {
		return "HospitalBean [id=" + id + ", hospitalName=" + hospitalName + ", founderName=" + founderName
				+ ", phoneNo=" + phoneNo + ", totalstaff=" + totalstaff + ", totalBeds=" + totalBeds + ", doctorName="
				+ doctorName + ", electricMedicalRecords=" + electricMedicalRecords + ", patientCare=" + patientCare
				+ ", nursingDept=" + nursingDept + ", nursingSupervisors=" + nursingSupervisors + ", operationTheatre="
				+ operationTheatre + ", laboratory=" + laboratory + ", ayurvedic=" + ayurvedic + ", patientHelpdesk="
				+ patientHelpdesk + "]";
	}







	
	
	
}
