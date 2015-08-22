package ua.org.oa.malahk;



public class Tablet extends MobileDevice {
	
	private boolean lte;

	public Tablet(String manufacturerName, double price, double screenSize,
			int batteryCapacity, boolean lte) {
		super(manufacturerName, price, screenSize, batteryCapacity);
		this.lte = lte;
		// TODO Auto-generated constructor stub
	}

	public boolean isLte() {
		return lte;
	}

	public void setLte(boolean lte) {
		this.lte = lte;
	}

	@Override
	public void showDescription() {
		// TODO Auto-generated method stub
		super.showDescription();
		System.out.println("LTE available : " + this.lte);

	}
	
	
	
}
