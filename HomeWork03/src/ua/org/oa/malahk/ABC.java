package ua.org.oa.malahk;

public class ABC
{
	public void find(String string)
	{
		int start = -2;
		
		for (int position = 0; position < string.length(); position++) {
			if ('b' != string.charAt(position)) {
				continue;
			}

			if (-2 == start) {
				start = position;
				continue;				
			}
			
			if (2 != position - start) {
				start = -2;
				continue;
			}
			
			
			System.out.println(string.substring(start, position));
			start = -2;
		}
	}
	

	public int find2(String string)
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
			//position += 2;
			System.out.println(string.substring(position - 2, position));
		}
		
		return counter;
	}
	public static String find3(String string)
	{
		
		for (int position = 0; position < string.length(); position++) {
			if ('*' != string.charAt(position)) {
				continue;
			}

			System.out.println(string.substring(position - 1, position + 1));
		}
		
		return string;
	}


}

