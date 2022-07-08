package com.xworkz.springframework.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
@ComponentScan(basePackages = "com.xworkz.springframework")
@Component
@Getter
@Setter
public class MovieBean {

	private String movieName;
	private String heroName;
	private String heroineName;
	private String directedBy;
	private String producedBy;
	private String musicDirctor;
	private String lyricist;
	private String choreoghrapher;
	private String editedBy;
	private String productionCompany;
	private String lang;
	private String distributedBy;
	private Integer totalStaff;
	private Integer totalDays;
	private double budset;
	
	
	
	public MovieBean() {
	
	}
	@Value("Mugaru Male")
     public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	@Value("Ganesh")
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	@Value("Pooja Gandhi")
	public void setHeroineName(String heroineName) {
		this.heroineName = heroineName;
	}
	@Value("Yograj Bhat")
	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}
	@Value("K krishna")
	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}
	@Value("Mano Murthy")
	public void setMusicDirctor(String musicDirctor) {
		this.musicDirctor = musicDirctor;
	}
	@Value("Jaynth Kaikini")
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	@Value("Harsha")
	public void setChoreoghrapher(String choreoghrapher) {
		this.choreoghrapher = choreoghrapher;
	}
	@Value("Deepu s")
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}
	@Value("E.K.Entertainers")
	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}
	@Value("Kannada")
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	@Value("Jayanna,Bhogendra")
	public void setDistributedBy(String distributedBy) {
		this.distributedBy = distributedBy;
	}
	@Value("300")
	public void setTotalStaff(Integer totalStaff) {
		this.totalStaff = totalStaff;
	}
	@Value("865")
	public void setTotalDays(Integer totalDays) {
		this.totalDays = totalDays;
	}
	@Value("70D")
	public void setBudset(double budset) {
		this.budset = budset;
	}
	
	@Override
	public String toString() {
		return "MovieBean [movieName=" + movieName + ", heroName=" + heroName + ", heroineName=" + heroineName
				+ ", directedBy=" + directedBy + ", producedBy=" + producedBy + ", musicDirctor=" + musicDirctor
				+ ", lyricist=" + lyricist + ", choreoghrapher=" + choreoghrapher + ", editedBy=" + editedBy
				+ ", productionCompany=" + productionCompany + ", lang=" + lang + ", distributedBy=" + distributedBy
				+ ", totalStaff=" +totalStaff+ ",totalDays ="+totalDays+", budset=" + budset + "]";
	}
		
	
	

}
