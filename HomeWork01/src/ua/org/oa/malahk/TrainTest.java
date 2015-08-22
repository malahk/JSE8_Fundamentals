package ua.org.oa.malahk;



public class TrainTest {
	
	double timeOnTheMove = 0;
	
	public static void main(String[] args) {
		TrainTests tests = new TrainTests();
		
		try {
			if (!tests.testTrainCanBeCreated()) {
				throw new Exception("not passed");
			};
			if (!tests.testArrivalTimeCanBeGet()) {
				throw new Exception("not passed");
			};
			if (!tests.testArrivalTimeCanBeGetAndCorrect()) {
				throw new Exception("not passed");
			};
			if (!tests.testArrivalTimeCanBeSet()) {
				throw new Exception("not passed");
			};
			if (!tests.testArrivalTimeCanBeGetAndCorrect()) {
				throw new Exception("not passed");
			};
			if (!tests.testCanChangeDirection()) {
				throw new Exception("not passed");
			};
			if (!tests.testChangeDirectionIncreaseArrivalTime()) {
				throw new Exception("not passed");
			};
			if (!tests.testChangeDirectionChangeWagonEnumDirection()) {
				throw new Exception("not passed");
			};
			if (!tests.testDoubleChangeDirection()) {
				throw new Exception("not passed");
			};
		} catch (Exception e) {
			System.out.println("exception");
		}

		System.out.print("All passed");
		
		
		// TODO Auto-generated method stub 	
	}

	
	
}
