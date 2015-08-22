package ou.org.oa.malahk;

public class Boss extends Employee {

	private int week;
	private double payment;
	
	public Boss(String name, String surname, int week, double payment) {
		super(name, surname);
		this.week = week;
		this.payment = payment;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double payment() {
		double rate = week * payment;
		System.out.println(rate);// TODO Auto-generated method stub
		return rate;
	}

}
