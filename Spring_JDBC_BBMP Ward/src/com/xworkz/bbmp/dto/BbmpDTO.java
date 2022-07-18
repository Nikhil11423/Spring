package com.xworkz.bbmp.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class BbmpDTO implements Serializable {

	//private static final long serialVersionUID = -3190244617634794387L;
	@NonNull
	private int id;
	@NonNull
	private int wardNo;
	@NonNull
	private String wardName;
	@NonNull
	private String corporator;
	@NonNull
	private String mla;
	@NonNull
	private double budget;
	@NonNull
	private double spent;
	private double reamning;

}
