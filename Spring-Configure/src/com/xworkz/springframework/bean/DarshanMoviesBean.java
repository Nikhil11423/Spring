package com.xworkz.springframework.bean;

import org.springframework.context.annotation.ComponentScan;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springfw")
@Getter
@Setter
public class DarshanMoviesBean {

	private String firstMovie;
	private String firstMovieHeroinName;
	private String firstMovieDirector;
	private String firstMovieMusicDirector;
	private String secondMovie;
	private String secondMovieHeroinName;
	private String secondMovieDirector;
	private String secondMovieMusicDirector;
	private String thirdMovie;
	private String thirdMovieHeroinName;
	private String thirdMovieDirector;
	private String thirdMovieMusicDirector;
	private String lastMovie;
	private String lastMovieHeroinName;
	private String lastMovieDirector;
	private String lastMovieMusicDirector;

	@Override
	public String toString() {
		return "DarshanMoviesBean [firstMovie=" + firstMovie + ", firstMovieHeroinName=" + firstMovieHeroinName
				+ ", firstMovieDirector=" + firstMovieDirector + ", firstMovieMusicDirector=" + firstMovieMusicDirector
				+ ", secondMovie=" + secondMovie + ", secondMovieHeroinName=" + secondMovieHeroinName
				+ ", secondMovieDirector=" + secondMovieDirector + ", secondMovieMusicDirector="
				+ secondMovieMusicDirector + ", thirdMovie=" + thirdMovie + ", thirdMovieHeroinName="
				+ thirdMovieHeroinName + ", thirdMovieDirector=" + thirdMovieDirector + ", thirdMovieMusicDirector="
				+ thirdMovieMusicDirector + ", lastMovie=" + lastMovie + ", lastMovieHeroinName=" + lastMovieHeroinName
				+ ", lastMovieDirector=" + lastMovieDirector + ", lastMovieMusicDirector=" + lastMovieMusicDirector
				+ "]";
	}

}
