package ou.org.oa.malahk;

public class HourlyWorker extends Employee {

	private int norm;
	private int hours;
	private double normPayment;
	private double overPayment;
	
	public HourlyWorker(String name, String surname, int hours, double overPayment, int norm, double normPayment) {
		super(name, surname);
		this.norm = norm;
		this.hours = hours;
		this.normPayment = normPayment;
		this.overPayment = overPayment;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double payment() {
		
		double rate = 0;
		
		if(hours <= norm) {
			rate = normPayment;
		} else
			rate = ((hours - norm) * overPayment) + normPayment;
		System.out.println(rate);// TODO Auto-generated method stub
		return rate;
	}

}
