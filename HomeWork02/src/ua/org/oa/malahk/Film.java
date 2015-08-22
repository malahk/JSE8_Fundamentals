package ua.org.oa.malahk;

import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Film
{
	protected int filmRating;
	protected String filmName;
	
	public Film (String filmName, int filmRating)
	{
		this.filmRating = filmRating;
		this.filmName = filmName;
	}
	
	public int getFilmRating()
	{
		return this.filmRating;
	}

	public void setFilmRating (int filmRating) 
	{
		this.filmRating = filmRating;
	}

	public void inputFilmRating () throws IOException 
	{
		String filmRatingInput;
		int filmRating;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Input film rating here (value between 1 - 10): ");
			filmRatingInput = in.readLine();
			filmRating = Integer.parseInt(filmRatingInput);
			if((filmRating < 1) || (filmRating > 10)) { 
				System.out.println("Incorrect value, input value between 1 - 10: ");
				continue;
			}
			
			break;
		}
		
		this.setFilmRating(filmRating);
	}
	
	public String getFilmName() 
	{
		return this.filmName;
	}

}
// создание
// подсчет среднего рейта
// рейт ниже/выше среднего
// рейт выше/ниже указанного
// UNIT TEST