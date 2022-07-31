package com.xworkz.ott.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class OttDTO  implements Serializable{

	private String name;
	private String region;
	private String language;
	private String pack;
	private int user;
	private int since; 
	private boolean status;
}
