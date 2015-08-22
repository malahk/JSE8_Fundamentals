package ua.org.oracle.academy.malahk;

import java.util.TreeSet;

public class EmploeeMain {
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Emploee a = new Emploee("Kirill", 28, 500);	
		Emploee b = new Emploee("Ivan", 35, 600);
		Emploee c = new Emploee("Kirill", 28, 400);
		Emploee d = new Emploee("Kirill", 31, 500);
		Emploee f = new Emploee("Zed", 31, 500);
		

		TreeSet<Emploee> emploeeSet = new TreeSet<Emploee>();

		emploeeSet.add(a);
		emploeeSet.add(b);

		for (Emploee e : emploeeSet) {
			System.out.println(e.getName());
		}

		EmployeeComp comp = new EmployeeComp();
		TreeSet<Emploee> emploeeSet1 = new TreeSet<Emploee>(comp);

		emploeeSet1.add(a);
		emploeeSet1.add(b);
		emploeeSet1.add(c);
		emploeeSet1.add(d);
		emploeeSet1.add(f);

		for (Emploee e : emploeeSet1) {
			System.out.println(e.toString());
		}

	}

}
