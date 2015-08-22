package ua.org.oa.malahk;

import java.util.*;
import java.util.ArrayList;

public class Cinema
{
	public ArrayList<Film> films;

	public Cinema ()
	{}
	
	public void addFilm (Film film)
	{
		this.films.add(film);
	}
	
	public void setFilms (ArrayList<Film> films)
	{
		this.films = films;
	}
	
	protected float averageFilmRating()
	{
		int sum = 0;
		for (Film film : this.films) {
			sum += film.getFilmRating();
		}
		
		return (float) sum / this.films.size();
	}
	
	protected void filmsWithRatingGreaterThen(float rating)
	{
		for (Film film : this.films) {
			if (film.getFilmRating() > rating) {
				System.out.println(film.getFilmName());
			}
		}
	}
	
	public void filmsWithRatingGreaterThenAvarage()
	{
		System.out.println("Films with rating greater avarage:");
		// 1
		this.filmsWithRatingGreaterThen(this.averageFilmRating());
//		
//		
//		// 2
//		float average = this.averageFilmRating();
//		this.filmsWithRatingGreaterThen(average);
//		
//		
//		// 3
//		int sum = 0;
//		for (Film film : this.films) {
//			sum += film.getFilmRating();
//		}
//		this.films = new ArrayList<Film>();
//		
//		float average = sum / this.films.size();
//		for (Film film : this.films) {
//			if (film.getFilmRating() > average) {
//				System.out.println(film.getFilmName());
//			}
//		}

	}
	
	
	public void filmsWithRatingGreaterThenInput(float rating)
	{
		System.out.println("Films with rating greater then " + rating + ":");
		this.filmsWithRatingGreaterThen(rating);
	}
	
}

Film film1 = new Film();
Film film2 = new Film();
Cinema cinema = new Cinema();
cinema.setFilms(ArrayList(film1, film2));
