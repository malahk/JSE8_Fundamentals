package ou.org.oa.malahk;

import java.util.ArrayList;




public class Firm {

	ArrayList<Employee> personnel = new ArrayList<>();
	
	public void addEmployee(Employee emp) 
	{
		if (personnel.size() == 0) {
			personnel.add(emp);
		} else
		for (Employee employee : personnel) {
			if (employee.equals(emp)) {
				System.out.println("Such employee is already exist, try another one");
				return;
			}
		
		}
		personnel.add(emp);
		System.out.println("Emlployee added succesfully");
	}

}

	
	

