package ua.org.oa.malahk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class MobileDeviceTest {

	public static void main(String[] args) {
		
		ArrayList<MobileDevice> myMobileDevices = new ArrayList<MobileDevice>();
		myMobileDevices.add(new Tablet("Asus", 100.0, 7.0,
				3000, true));
		myMobileDevices.add(new Tablet("Samsung", 500.0, 12.0,
				4000, false));
		myMobileDevices.add(new Mobile("Samsung 1", 20.02, 2.4,
				1000, true));
		myMobileDevices.add(new Mobile("Samsung", 20.0, 2.4,
				1000, true));
		myMobileDevices.add(new Mobile("Samsung 2", 20.01, 2.4,
				1000, true));
		myMobileDevices.add(new Mobile("Nokia", 30.0, 3.0,
				1100, false));
		myMobileDevices.add(new SmartPhone("HTC", 400.0, 5.0,
				2500, true));
		myMobileDevices.add(new SmartPhone("Fly", 200.0, 4.5,
				2000, false));
		
		// TODO Auto-generated method stub

		

		Comparator<MobileDevice> comparatorByPrice = (o1, o2) -> {
			return o1.getPrice() > o2.getPrice() ? -3 : (o1.getPrice() < o2.getPrice() ? 1 : 0);
		};

		Comparator<MobileDevice> comparatorByPrice2 = (o1, o2) -> {
			return (int) ((o2.getPrice() - o1.getPrice()) * 100);
		};

		
//		myMobileDevices.sort(comparatorByPrice2);
//		for (MobileDevice mobileDevice : myMobileDevices) {
//			mobileDevice.showDescription();
//		}
		System.out.println("List of DualSim devices: ");
		for (MobileDevice mobileDevice : myMobileDevices) {
			if (!(mobileDevice instanceof Mobile)) {
				continue;
			}
			
			if (((Mobile) mobileDevice).isDualSim()) {
				mobileDevice.showDescription();
			}
		}	
		
		System.out.println("List tablets with screen bigger than 9inch: ");
		for (MobileDevice mobileDevice : myMobileDevices) {
			if (!(mobileDevice instanceof Tablet)) {
				continue;
			}
			
			for (MobileDevice mobiledevice : myMobileDevices) {
				if (mobileDevice.getScreenSize() > 9) {
					mobileDevice.showDescription();
				}
			}
		}
		System.out.println("List of smartphones with battery capacity bigger than 2200mAh: ");
		for (MobileDevice mobileDevice : myMobileDevices) {
			if (!(mobileDevice instanceof SmartPhone)) {
				continue;
			}
			
			for (MobileDevice mobiledevice : myMobileDevices) {
				if (mobileDevice.getBatteryCapacity() > 2200) {
					mobileDevice.showDescription();
				}
			}
		}
		

//		Comparator<Clothing> comparatorCloth = (o1, o2) ->{
//			if(o1.getSize() > o2.getSize()){
//				return -1;
//			}
//			if(o1.getSize() < o2.getSize()){
//				return 1;
//			}
//			
//			return 0;
//		};
//
//		Comparator<Clothing> comparatorCloth = (o1, o2) ->{
//			if(o1.getSize() > o2.getSize()){
//				return -1;
//			}
//			if(o1.getSize() < o2.getSize()){
//				return 1;
//			}
//			
//			return 0;
//		};
		
		
	}
	
	
}
