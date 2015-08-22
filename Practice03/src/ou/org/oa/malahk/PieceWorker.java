package ou.org.oa.malahk;

public class PieceWorker extends Employee {

	private int quantity;
	private double payment;
	
	public PieceWorker(String name, String surname, int quantity, double payment) {
		super(name, surname);
		this.quantity = quantity;
		this.payment = payment;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double payment() {
		double rate = quantity * payment;
		System.out.println(rate);// TODO Auto-generated method stub
		return rate;
	}

}
