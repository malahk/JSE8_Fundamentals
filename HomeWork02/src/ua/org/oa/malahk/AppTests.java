package ua.org.oa.malahk;

import java.io.IOException;



public class AppTests {
	
	public AppTests() {
		
	}

	public Boolean testFilmCanBeCreated () {
		Film film = new Film("Avengers", 5);

		return true;
	}
	public Boolean testFilmNameCanBeGet () {
		Film film = new Film("Avengers", 5);
		String result;
		
		result = film.getFilmName();
		
		return result == "Avengers";
	}
	public Boolean testFilmRatingCanBeGet () {
		Film film = new Film("Avengers", 5);
		float result;
		
		result = film.getFilmRating();
		
		return result == film.getFilmRating();
	}
	public Boolean testFilmRatingCanBeSet () throws IOException {
		Film film = new Film("Avengers", 5);
		
		film.setFilmRating(9);
		
		return true;
		
	}
	public Boolean testFilmRatingCanBeSetAndCorrect () throws IOException {
		Film film = new Film("Avengers", 5);
		int result = 9;
		film.setFilmRating(result);
		
		return result == film.getFilmRating();
		
	}
	
}