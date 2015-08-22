package ou.org.oa.malahk;

public class CommisionWorker extends Employee {

	private double payment;
	private double sales;
	private double percent;
	
	public CommisionWorker(String name, String surname, double percent, double sales, double payment) {
		super(name, surname);
		this.payment = payment;
		this.sales = sales;
		this.percent = percent;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double payment() 
	{
		double rate = this.payment + sales * (percent/100);
		System.out.println(rate);// TODO Auto-generated method stub
		return rate;
	}

}
