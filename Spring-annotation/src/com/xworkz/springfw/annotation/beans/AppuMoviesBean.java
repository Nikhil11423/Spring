package com.xworkz.springfw.annotation.beans;



	import org.springframework.beans.factory.annotation.Value;
	import org.springframework.stereotype.Component;

	@Component
	public class AppuMoviesBean {

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

		public AppuMoviesBean() {
			// TODO Auto-generated constructor stub
		}

		@Value("Appu")
		public void setFirstMovie(String firstMovie) {
			this.firstMovie = firstMovie;
		}

		@Value("Rakshita")
		public void setFirstMovieHeroinName(String firstMovieHeroinName) {
			this.firstMovieHeroinName = firstMovieHeroinName;
		}

		@Value("Puri Jagannadh")
		public void setFirstMovieDirector(String firstMovieDirector) {
			this.firstMovieDirector = firstMovieDirector;
		}

		@Value("Gurukiran")
		public void setFirstMovieMusicDirector(String firstMovieMusicDirector) {
			this.firstMovieMusicDirector = firstMovieMusicDirector;
		}

		@Value("Abhi")
		public void setSecondMovie(String secondMovie) {
			this.secondMovie = secondMovie;
		}

		@Value("Ramya")
		public void setSecondMovieHeroinName(String secondMovieHeroinName) {
			this.secondMovieHeroinName = secondMovieHeroinName;
		}

		@Value("Dinesh Babu")
		public void setSecondMovieDirector(String secondMovieDirector) {
			this.secondMovieDirector = secondMovieDirector;
		}

		@Value("Gurukiran")
		public void setSecondMovieMusicDirector(String secondMovieMusicDirector) {
			this.secondMovieMusicDirector = secondMovieMusicDirector;
		}

		@Value("Veera Kannadiga")
		public void setThirdMovie(String thirdMovie) {
			this.thirdMovie = thirdMovie;
		}

		@Value("Anitha Hassanandani Reddy")
		public void setThirdMovieHeroinName(String thirdMovieHeroinName) {
			this.thirdMovieHeroinName = thirdMovieHeroinName;
		}

		@Value("Meher Ramesh")
		public void setThirdMovieDirector(String thirdMovieDirector) {
			this.thirdMovieDirector = thirdMovieDirector;
		}

		@Value("Chakri")
		public void setThirdMovieMusicDirector(String thirdMovieMusicDirector) {
			this.thirdMovieMusicDirector = thirdMovieMusicDirector;
		}

		@Value("James")
		public void setLastMovie(String lastMovie) {
			this.lastMovie = lastMovie;
		}

		@Value("Priya anand")
		public void setLastMovieHeroinName(String lastMovieHeroinName) {
			this.lastMovieHeroinName = lastMovieHeroinName;
		}

		@Value("Chethan Kumar")
		public void setLastMovieDirector(String lastMovieDirector) {
			this.lastMovieDirector = lastMovieDirector;
		}

		@Value("V. Harikrishna")
		public void setLastMovieMusicDirector(String lastMovieMusicDirector) {
			this.lastMovieMusicDirector = lastMovieMusicDirector;
		}

		@Override
		public String toString() {
			return "AppuMoviesBean [firstMovie=" + firstMovie + ", firstMovieHeroinName=" + firstMovieHeroinName
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


