package ua.org.oa.malahk;

public class stringUtilsTest {

	public static void main(String[] args) {
		System.out.println("-------- Test First Task -------");
		String s1 = "Hhello";
		String s2 = "Wworld";
		System.out.println("First string : " + s1);
		System.out.println("Second string : " + s2);
	System.out.println("Result: " +  stringUtils.firstTask(s1, s2));// TODO Auto-generated method stub

	/*System.out.println("-------- Test Second Task -------");
		String s3 = "Leave";
		String s4 = "Candy";
		System.out.println("First string : " + s3);
		System.out.println("Second string : " + s4);
	System.out.println("Result: " +  stringUtils.secondTask(s3, s4));*/
	
	System.out.println("-------- Test Third Task -------");
		String s5 = "Strings are immutable";
	System.out.println("Result: " + stringUtils.thirdTask(s5));
	
	
	System.out.println("--------  Test Fourth Task -------");
		StringBuilder sb1 = new StringBuilder("Candy");
	System.out.println("Result: " + stringUtils.fourthTask());
	}
	
	
}
	







}
