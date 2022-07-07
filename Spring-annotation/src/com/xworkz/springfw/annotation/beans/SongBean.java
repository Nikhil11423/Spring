package com.xworkz.springfw.annotation.beans;

import java.sql.Time;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component

public class SongBean {
	
	
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
	private Time songTime;
	private String lang;
	private String uploadedBy;
	private String category;
	
	public SongBean(@Value("neenendare nannolage") String songName, @Value("sonu nighan") String singerName,
			@Value("V Harikrisna") String musicDirector, @Value("junglee") String movieName,
			@Value("duniya vijay") String heroName, @Value("Aindritha rai") String heroineName,
			@Value("Jayant Kaikini") String lyricistName, @Value("mp3") String type, @Value("hari") String musicLabel,
			@Value("kannada") String lang, @Value("Rockline venkatesh") String uploadedBy,
			@Value("melody") String category) {
		System.out.println("create song bean");
		this.songName = songName;
		this.singerName = singerName;
		this.musicDirector = musicDirector;
		this.movieName = movieName;
		this.heroName = heroName;
		this.heroineName = heroineName;
		this.lyricistName = lyricistName;
		this.type = type;
		this.posted = posted;
		this.musicLabel = musicLabel;
		this.songTime = songTime;
		this.lang = lang;
		this.uploadedBy = uploadedBy;
		this.category = category;

	}
	

	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "SongBean [songName=" + songName + ", singerName=" + singerName + ", musicDirector=" + musicDirector
				+ ", movieName=" + movieName + ", heroName=" + heroName + ", heroineName=" + heroineName
				+ ", lyricistName=" + lyricistName + ", type=" + type + ", posted=" + posted + ", musicLabel="
				+ musicLabel + ", songTime=" + songTime + ", lang=" + lang + ", uploadedBy=" + uploadedBy
				+ ", category=" + category + "]";
	}
	
	
	
	
}
