package ua.org.oa.malahk;

import java.util.ArrayList;

public class Weather
{	
	
	public void processData(ArrayList<Float> data)
	{
		int biggest = 0;
		int smallest = 0;
		Float sum = new Float(0.0);
		
		for (int position=0; position < data.size(); position++) {
			sum += data.get(position);
			
			if (data.get(position) > data.get(biggest)) {
				biggest = position;
			}
			if (data.get(position) < data.get(smallest)) {
				smallest = position;
			}
		}
		
		System.out.println("median: " + (sum / data.size()));
		System.out.println("hottest day: " + biggest + " with temperature:" + data.get(biggest));
		System.out.println("collest day: " + smallest + " with temperature:" + data.get(smallest));
	}
	

}
