package ua.org.malahk;

public class PrimitiveDataTypeLoopsUtils {
	
	public static byte myByte;
	public static short myShort;
	public static int myInt;
	public static long myLong;
	public static double myDouble;
	public static float myFloat;
	public static char myChar;
	public static boolean myBoolean;
	
	public static void firstTask(){
System.out.println("Task 1: �������� �����, � ������� ������������ ���������� ������ ���� ����������� �����. �������� �� ����� �������� ����� ������ ��� ��������������� �������������.  ��������� ���� ����� ��� ��������� ����������.");		
		System.out.println("myByte -> " + myByte);
		System.out.println("myShort -> " + myShort);
		System.out.println("myInt -> " + myInt);
		System.out.println("myLong -> " + myLong);
		System.out.println("myDouble -> " + myDouble);
		System.out.println("myFloat -> " + myFloat);
		System.out.println("myChar -> " + myChar);
		System.out.println("myBoolean -> " + myBoolean);
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		
		byte myByteLocal = 1;
		short myShortLocal = 1;
		int myIntLocal = 1;
		long myLongLocal = 1;
		double myDoubleLocal = 1;
		float myFloatLocal = 1;
		char myCharLocal = 1;
		boolean myBooleanLocal = true;
		
			
			System.out.println("myByteLocal -> " + myByteLocal);
			System.out.println("myShortLocal -> " + myShortLocal);
			System.out.println("myIntLocal -> " + myIntLocal);
			System.out.println("myLongLocal -> " + myLongLocal);
			System.out.println("myDoubleLocal -> " + myDoubleLocal);
			System.out.println("myFloatLocal -> " + myFloatLocal);
			System.out.println("myCharLocal -> " + myCharLocal);
			System.out.println("myBooleanLocal -> " + myBooleanLocal);
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			
			
System.out.println("Task 2:�������� ��������� ���������� ���� float. ��������� ���� ���������� ��������� ��������:");
	       
			float a = (float) 1.;
	        float b = 1;
	        float c = 0x1;
	        float d = 0b1;
	        float e = (float) 1.0e1;
	        float f = 01;
	        
	        System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			
System.out.println("Task 3: �������� ���������� ���� short. ���������������� �� ����������� ���������� ��������� ��������:");
			
			System.out.println("- ������ ���� ����� �����");
			short a1 = 5+5;
				System.out.println(a1);
			System.out.println("---------------------------------");
			
			System.out.println("- ������ ������ � �������� �����");
			short a2 = (short) (5 +5.0);
				System.out.println(a2);
			System.out.println("---------------------------------");
			
			System.out.println("- ������ �������� ���������� ����� float � int");
			int b1 = 5; float b2 = 1;
			short a3 = (short)(b1 + b2);
				System.out.println(a3);
			System.out.println("---------------------------------");
			
			System.out.println("- ������ �������� ���������� ���� byte + short");
			byte c1 = 2; byte c2 = 3;
			short a4 = (short)(c1 + c2);
				System.out.println(a4);
			System.out.println("---------------------------------");
			
			System.out.println("- ������ �������� ���������� ���� float + double");
			float d1 = 2; double d2 = 3;
			short a5 = (short)(d1 + d2);
				System.out.println(a5);
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			
System.out.println("Task 4:	������ �������� 2-� ������� � ���������� ������������. ��������� �������� �� ������ ����������� �������������. ���������� �������� ����������, ��������� �� ����� ������ (��������� �������� �?:�).");		
			
			int a7 = 7;
			int b7= 8;
			int c7 = 13; 
			
			String checkResult = ((a7 * a7) + (b7 * b7) == (c7 * c7)) ? "The triangle is rectangle!" : "The triangle is nonrectangle!";
				System.out.println(checkResult);
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");

System.out.println("Task 5: ���������� ����� ����� ����� �� 1 �� 20.");	
			
			int i = 0;
			
			int sum = 0;
		
		for (i = 0; i <= 20; i++) {
			
			if (i%1 == 0) {
				sum += i;
				}
			}
			
		System.out.println(sum);
		System.out.println("---------------------------------");
		System.out.println("---------------------------------");
		
System.out.println("Task 6: ���������� ����� ������ ����� ����� �� 1 �� 20.");
		
		int i2 = 0;
		
		int sum2 = 0;
	
	for (i2 = 0; i2 <= 20; i2++) {
		
		if (i2 % 2 == 0){
			sum2 += i2;
			}
		
	}
		
	System.out.println(sum2);
	System.out.println("---------------------------------");
	System.out.println("---------------------------------");
	
System.out.println("Task 7: ���������� ����� ������� ����� � ��������� �� 1 �� 20.");;
	int number;
	int divider;
	int sum3 = 0;
	boolean isSimple = true;
	for (number = 2; number <= 20; ++number) {
		isSimple = true;
		for (divider = 2; divider < number; ++divider) {
			System.out.println("k: " + number + ", j: " + divider);
			if (0 == number % divider) {
				System.out.println("    not simple, break");
				isSimple = false;
				break;
			}
			
		}

		if (isSimple) {
			sum3 += number;
//			System.out.println(k);
		}
		System.out.println("new sum: " + sum3);
//		System.out.println("number: " + k + " testing: " + j + " summary: " + sum3);
	}
	System.out.println(sum3);



System.out.println("---------------------------------");
System.out.println("---------------------------------");

System.out.println("Task 8: ���� ��� ���������� ���� int a, b, c �������� �� ����� �true�, ���� ����� �������� ���� ����� �� ���� ���������� ����� �������� �������.");

	int a6 = 7;
	int b6 = 8;
	int c6 = 13; 

	if ((a6 + b6 == c6) || (b6 + c6 == a6) || (c6 + a6 == b6)) {
		System.out.println("The row is true!");
	}else
		System.out.println("The row is false!");

	if ((a6 + b6 != c6) || (b6 + c6 != a6) || (c6 + a6 != b6)) {
		System.out.println("The row is false!");
	}else
		System.out.println("The row is true!");
	System.out.println("---------------------------------");
	System.out.println("---------------------------------");
    	
System.out.println("Task 9: ��� ���������� ���� int, ����� ������������� �������� int a - ������ ���������, int b - ����� ���������, a>b. ��������� ������� �������� ����� � �������� ���������.");    	

	//int startRahge > int endRange by default
	int startRange = 256;
	int endRange = 128;
    int sumRange = 0;
    
    for (i = startRange; i >= endRange; --i) {
    	sumRange += i;   	
   } 
    	System.out.println("The middle meaning of numbers in range from " + startRange + " till " + endRange + " is: " + (sumRange / (startRange - endRange + 1))); 
    System.out.println("---------------------------------");
   	System.out.println("---------------------------------");
    	
 System.out.println("Task 10: ");   	
    
    double creditBody; //���� �������	
    double creditTime; //���� ������������
    double tax; // % ������
	double taxSum = 0; // �������� %
	double creditDept = creditBody - (monthPayment * creditTime); //������� �� ���� �������
	double monthTax = creditDept / 100 * tax; // ����������� % ������
	double monthPayment = ((creditBody / creditTime) + monthTax); // ������ �� ���� �������
	int t;
		
	
	for (t = 1; t <= creditTime; ++t) {	

		
	    taxSum += monthTax;		
	}}
	
}











	

		
		
		
		
	
	
	
	
	
	
	
	


