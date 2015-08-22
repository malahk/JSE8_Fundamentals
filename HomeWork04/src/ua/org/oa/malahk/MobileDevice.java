package ua.org.oa.malahk;

public abstract class MobileDevice {
	
	protected String manufacturerName;
	protected double price;
	protected double screenSize;
	protected int batteryCapacity;
	

	public MobileDevice(String manufacturerName, double price,
			double screenSize, int batteryCapacity) 
	{
		this.manufacturerName = manufacturerName;
		this.price = price;
		this.screenSize = screenSize;
		this.batteryCapacity = batteryCapacity;

	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public void showDescription() {
		System.out.println("--------------------------");
		System.out.println("Device : " + this.manufacturerName);
		System.out.println("Device price : " + this.price);
		System.out.println("Screen size : " + this.screenSize);
		System.out.println("Device battery capacity : " + this.batteryCapacity);
		
	}

}


