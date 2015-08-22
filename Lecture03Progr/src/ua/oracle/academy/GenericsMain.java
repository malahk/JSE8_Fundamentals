package ua.oracle.academy;

import java.util.ArrayList;

public class GenericsMain {

	public static void main(String[] args) {
		Generics intGen = new Generics(12);
		Generics strGen = new Generics("dddd");
		Generics listGen = new Generics(new ArrayList());
		Gen <Integer> intGen1 = new Gen(12);
		Gen <String> strGen1 = new Gen("dddd");
		//Gen <?>>listGen = new Gen(new ArrayList());
		
		intGen = strGen;
		
		Integer value = (Integer)intGen.getOb();
		// TODO Auto-generated method stub

	}

}
