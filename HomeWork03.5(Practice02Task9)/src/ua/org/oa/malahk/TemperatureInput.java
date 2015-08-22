package ua.org.oa.malahk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class TemperatureInput {

	public static void main(String[] args)
	{
		/*		     
		          // create a calendar
		Calendar cal = Calendar.getInstance(Locale.US);
	
			      // print the date for canada 
		System.out.println("Date And Time in US Is: " + cal.getTime());
		*/   
	

		Weather weather = new Weather();
		int iYear = 2015;
		int iMonth = Calendar.APRIL;
		int iDay = 1;
	// Create a calendar object and set year and month
		Calendar mycal = new GregorianCalendar(iYear, iMonth, iDay);
	
	// Get the number of days in that month
		int daysInMonth1 = mycal.getActualMaximum(Calendar.DAY_OF_MONTH); // 28
		System.out.println(daysInMonth1);
		
		ArrayList<Float> temperatureInput = TemperatureInput.temperatureInput(daysInMonth1);
		weather.processData(temperatureInput);
	}
	
	
	public static ArrayList<Float> temperatureInput(int daysInMonth)
	{
		ArrayList<Float> temperatureInput = new ArrayList<Float>();
		String temperatureValueInput;
		float temperature;
		int i = 1;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(i <= daysInMonth) {
			System.out.println("Input " + (i) + "-th day temperature value (value between -60 - 60):");
			try {
				temperatureValueInput = in.readLine();
				temperature = Float.parseFloat(temperatureValueInput);			
			} catch (Exception e) {
				System.out.println("Incorrect value, input float: ");
				continue;
			}
			
			if((temperature < -60) || (temperature > 60)) { 
				System.out.println("Incorrect value, input value between -60 - 60: ");
				continue;
			}
			
			temperatureInput.add(temperature);
			i++;
		}
		
		return temperatureInput;
	}
	
  }
	

		
		/*
		public void tempertureInput () throws IOException 
		{
			String tempertureInput;
			float temperature;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.println("Input temperaturevalue here (value between -60 - 60): ");
				temperatureValueInput = in.readLine();
				temperature = Float.parseFloat(temperatureInput);
				if((temperature < -60) || (temperature > 60)) { 
					System.out.println("Incorrect value, input value between -60 - 60: ");
					continue;
				}
				
				break;
			}
			
			this.setTemperature(temperature);
		}*/
		
		/*
		public void tempertureInput() throws IOException{
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String tempertureInput;
			float temperature;
			int i;
			
			
			while(i <= daysInMonth1) {
				System.out.println("Input " + (i) + "-th day temperature value (value between -60 - 60):");
				temperatureValueInput = in.readLine();
				try {
					temperature = Float.parseFloat(temperatureValueInput);
					
								
				} catch (Exception) {
					System.out.println("Incorrect value, input float: ");
					continue;
				}
				
				
				if((temperature < -60) || (temperature > 60)) { 
					System.out.println("Incorrect value, input value between -60 - 60: ");
					continue;
				}
				
				
				addDay(new day(temperature));
				i++;
			}
		}
		
	}*/
	
	/*
	 * public void days_in_month_java8() {
    
    LocalDate date = LocalDate.of(2014, Month.APRIL, 01);

    int length = date.getMonth().length(true);
    
    assertEquals(30, length);

    // or
    
    int length2 = date.lengthOfMonth();
    
    assertEquals(30, length2);       
}
	 */


		// TODO Auto-generated method stub



	


