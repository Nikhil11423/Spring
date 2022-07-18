package com.xworkz.armydetails.dto;




import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class ArmyDetailsDTO implements Serializable {

	@NonNull
	private Integer id;
	@NonNull
	private String name;
	@NonNull
	private LocalDate founded;
	@NonNull
	private String country;
	@NonNull
	private String type;
	@NonNull
	private Integer activePerson;
	@NonNull
	private Integer reservePerson;
	@NonNull
	private String motto;
	@NonNull
	private String commamder_in_Chief;
	@NonNull
	private String chief_of_Army_Staff;
	@NonNull
	private String voicechief_of_Army_Staff;
	@NonNull
	private String headquaters;

}
