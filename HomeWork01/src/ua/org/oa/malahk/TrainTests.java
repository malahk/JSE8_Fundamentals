package ua.org.oa.malahk;

import java.security.InvalidParameterException;

public class TrainTests {

	public TrainTests() {
		// TODO Auto-generated constructor stub
	}
	
	public Boolean testTrainCanBeCreated() {
		Train train = new Train("44", 22.05, 13.10, "ascending", 4, false);

		return true;
	}
	

	public boolean testArrivalTimeCanBeGet () {
		Train train = new Train("44", 22.05, 13.10, "ascending", 4, false);

		train.getArrivalTime();

		return true;
	}
	
	public boolean testArrivalTimeCanBeGetAndCorrect () {
		Train train = new Train("44", 22.05, 13.10, "ascending", 4, false);
		double result;

		result = train.getArrivalTime();

		return result == 22.05;
	}

	public Boolean testArrivalTimeCanBeSet () {
		Train train = new Train("44", 22.05, 13.10, "ascending", 4, false);

		train.setArrivalTime(18.20);

		return true;
	}
	
	public Boolean testArrivalTimeCanBeSetAndCorrect () {
		Train train = new Train("44", 22.05, 13.10, "ascending", 4, false);
		double result = 18.20;
		train.setArrivalTime(result);

		return result == train.getArrivalTime();
	}

	public Boolean testCanChangeDirection () {
		Train train = new Train("44", 22.05, 13.10, "ascending", 4, false);
		
		train.reverseWagonDirection();
		
		return true;
	}

	public Boolean testChangeDirectionIncreaseArrivalTime () {
		Train train = new Train("44", 22.05, 13.10, "ascending", 4, false);
		double oldArrival = 22.05;
		train.setArrivalTime(oldArrival);
		
		train.reverseWagonDirection();
		
		return train.getArrivalTime() == oldArrival + 0.3;
	}

	public Boolean testChangeDirectionChangeWagonEnumDirection () {
		// @todo 
		
		return true;
	}
	

	public Boolean testDoubleChangeDirection () {
		// preparations - create and setup everything
		Train train = new Train("44", 22.05, 13.10, "ascending", 4, false);
		double oldArrival = 22.05;
		train.setArrivalTime(oldArrival);
		
		// test - run function, that should be tested
		train.reverseWagonDirection();
		train.reverseWagonDirection();
	
		// asserts - check that everything is correct
		// @todo direction not changed
		return train.getArrivalTime() == oldArrival + 1;
	}
}
