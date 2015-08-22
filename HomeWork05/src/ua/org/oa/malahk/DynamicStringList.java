package ua.org.oa.malahk;

import java.util.Arrays;

public class DynamicStringList implements SimpleList {
	
	private int index = 0;
	private String[] myData; 

	public DynamicStringList() {
		myData = new String[0];
		// TODO Auto-generated constructor stub
	}
	
	

	public DynamicStringList(int size) {
		myData = new String[size];
		
	}



	@Override
	public void add(String s) {
		if ((index + 1) - myData.length > 0) {
			myData = Arrays.copyOf(myData, index + 1);
				myData[index++] = s;
		}// TODO Auto-generated method stub
		
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return myData[index - 1];
	}

	@Override
	public String get(int id) {
		// TODO Auto-generated method stub
		return myData[id];
	}

	@Override
	public String remove() {
		String deletedString = myData[index];
		myData[--index] = null;// TODO Auto-generated method stub
		return deletedString;
	}

	@Override
	public String remove(int id) {
		String deletedString = myData[id];
		int numberMoved = index - id - 1;
		System.arraycopy(myData, id + 1, myData, id, numberMoved);
		myData[--index] = null;
		return deletedString;
	}

	@Override
	public boolean delete() {
		for (int i = 0; i < index; ++i) 
			myData[i] = null;
		index = 0;// TODO Auto-generated method stub
		return true;
	}

}
