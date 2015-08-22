package ua.org.oa.malahk;



public class Mobile extends MobileDevice {
	
	protected boolean dualSim;

	public Mobile(String manufacturerName, double price, double screenSize,
			int batteryCapacity, boolean dualSim) {
		super(manufacturerName, price, screenSize, batteryCapacity);
		this.dualSim = dualSim;		// TODO Auto-generated constructor stub
	}

	public boolean isDualSim() {
		return dualSim;
	}

	public void setDualSim(boolean dualSim) {
		this.dualSim = dualSim;
	}

	@Override
	public void showDescription() {
		// TODO Auto-generated method stub
		super.showDescription();
		System.out.println("DualSim available : " + this.dualSim);
	}

	
}
