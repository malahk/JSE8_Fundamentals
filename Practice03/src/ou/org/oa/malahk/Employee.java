package ou.org.oa.malahk;

public abstract class Employee {

	private String name;
	private String surname;
	
	public Employee(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public void getName() {
		System.out.println(name);
	}

	public void getSurname() {
		System.out.println(surname);
	}
	abstract public double payment();
	
	public String toString() {
		return "Employee [name = " + name + surname + ", rate = " + payment + "]";
	}	
}

