package com.xworkz.springframework.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springframework")
@Component
@Getter
@Setter
public class CollegeBean {

	
	private String name;
	private int totalDepartment;
	private long phoNo;
	private String principalName;
	private String email; 
	private String coordinaterName;
	private String address;
	private String talukName;
	private String distName;
	private String gsName;
	private String lsName;
	private Integer totalBoys;
	private Integer totalGirls;
	private boolean grade;
	private String equcationQuality;
	
	@Override
	public String toString() {
		return "CollegeBean [name=" + name + ", totalDepartment=" + totalDepartment + ", phoNo=" + phoNo
				+ ", principalName=" + principalName + ", email=" + email + ", coordinaterName=" + coordinaterName
				+ ", address=" + address + ", talukName=" + talukName + ", distName=" + distName + ", gsName=" + gsName
				+ ", lsName=" + lsName + ", totalBoys=" + totalBoys + ", totalGirls=" + totalGirls + ", grade=" + grade
				+ ", equcationQuality=" + equcationQuality + "]";
	}
	
	
}
