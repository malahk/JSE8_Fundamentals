package ua.org.oa.malahk;

import java.util.Set;

public class Train {
	
	protected String trainNumber = ""; //����� ������
	protected double arrivalTime;	//����� ��������
	protected double dispatchTime; //����� �������
	protected String wagonEnumDirection = ""; //����������� ��������� ������ (ascending/descending);
	protected int platformNumber; // �����  ���������
	protected boolean trainAvailability; //���� �� ����� � ����������

	public Train (
			String trainNumber,
			double arrivalTime, 
			double dispatchTime, 
			String wagonEnumDirection, 
			int platformNumber,
			boolean trainAvailability
			) {
		this.trainNumber = trainNumber;
		this.setArrivalTime(arrivalTime);
		this.dispatchTime = dispatchTime;
		this.wagonEnumDirection = wagonEnumDirection;
		this.platformNumber = platformNumber;
		this.trainAvailability = trainAvailability;
	
		
	}
	public void setArrivalTime(double arrivalTime) {
		int minutes = (int)(arrivalTime * 100 ) % 100;
		if (minutes > 59) {
//			arrivalTime -= minutes + 1;
//			minutes -= 0.6;
//			arrivalTime += minutes;
			
			// or same
			arrivalTime += 0.4;
		}

		this.arrivalTime = arrivalTime;
	}
	public double getArrivalTime() {
		int hours = (int) this.arrivalTime;
		int minutes = (int) (this.arrivalTime * 100 ) % 100;

		return (double) hours + ((double) minutes / 100);
	}

	public void reverseWagonDirection () {
		if (this.wagonEnumDirection == "ascending") {
			this.wagonEnumDirection = "descending"; 
		} else {
			this.wagonEnumDirection = "ascending";
		}

		this.setArrivalTime(this.getArrivalTime() + 0.30);
	}
	
	
	
	//public static void Schedule () {	}
	
/*public static void main TrainsScheduleOutput {
	
	System.out.println("����� ������: " + trainNumber);
	System.out.print("����� ��������: " + arrivalTime);
	System.out.println(" ����� �������: " + dispatchTime);
	System.out.println("����������� ��������� " + wagonEnum);
	System.out.println("���� �� ���� ����� �������" + trainAvailability);
	
	
	
	
}*/

}
