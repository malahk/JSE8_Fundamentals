package ua.org.oa.malahk;

public class stringUtils {

	//task1
	public static String firstTask(String s1, String s2) 
	{
		return s1.substring(1).concat(s2.substring(1));
				
	}
	
	public static String secondTask(String s3, String s4) 
	{
		
		int start = (s3.length() / 2) + 1;
		int end = (s3.length() / 2) + 2;

		if (s3.length() % 2 != 0) {
			System.out.println("Incorrect string");
		return null;
		} 

		return s3.substring(start, end), s4.substring(start, end);
	}

	public static String thirdTask(String s5) 
	{
		int i = s5.length() - 1;
		int j = s5.length() - 2;
		char result = s5.charAt(i);
		char result2 = s5.charAt(j);
		String myString = (charAt(i) + charAt(j));
		return (myString + s5); 
		
		
	}
	public void fourthTask() 
	{
		
		String s6;
		
		StringBuilder sb1 = new StringBuilder ("Candy");
		for (int i = 0; i < sb1.length(); i += 2) {
			sb1 = sb1.insert(i, sb1.charAt(i));
		}
		s6 = sb1.toString();
		System.out.println(s6);
		
	}   
	public int fifthTask(String string)
	{
		int counter = 0;
		
		if (string.length() < 3) {
			return 0;
		}
		
		for (int position = 2; position < string.length(); position++) {
			if ('b' != string.charAt(position)) {
				continue;
			}

			if ('b' != string.charAt(position - 2)) {
				continue;
			}

			++counter;
		}
		
		System.out.println(counter);
		return counter;
	}

	public static String sixthTask(String string)
	{
		
		for (int position = 0; position < string.length(); position++) {
			if ('*' != string.charAt(position)) {
				continue;
			}

			System.out.println(string.substring(position - 1, position + 1));
		}
		
		return string;
	}

	public void seventhTask() 
	{
		
		String s7 = null;
		int counter1 = 0;
		
		for (int i = 0; i < s7.length(); ++i) {
			if (s7.charAt(i) == ' '){
				if ((s7.charAt(i - 1) == 'a') || (s7.charAt(i - 1) == 's')){
					++counter1;
			}
			System.out.println(counter1);	
		}
	}
	
  }
	public void eighthTask() 
	{
		
	}
}
