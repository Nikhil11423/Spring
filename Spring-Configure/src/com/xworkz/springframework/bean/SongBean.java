package com.xworkz.springframework.bean;


import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springframework")
@Component
@Getter
@Setter
public class SongBean {
	
	private int id;
	private String songName;
	private String singerName;
	private String musicDirector;
	private String movieName;
	private String heroName;
	private String heroineName;
	private String lyricistName;
	private String type;
	private LocalDate posted;
	private String musicLabel;
	private LocalTime songTime;
	private String lang;
	private String uploadedBy;
	private String category;

	@Override
	public String toString() {
		return "SongBean [id=" + id + ", songName=" + songName + ", singerName=" + singerName + ", musicDirector="
				+ musicDirector + ", movieName=" + movieName + ", heroName=" + heroName + ", heroineName=" + heroineName
				+ ", lyricistName=" + lyricistName + ", type=" + type + ", posted=" + posted + ", musicLabel="
				+ musicLabel + ", songTime=" + songTime + ", lang=" + lang + ", uploadedBy=" + uploadedBy
				+ ", category=" + category + "]";
	}


}



