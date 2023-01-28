package day4;

public class Bus extends Vehicle{
	private int noOfPassengers;
	
	public Bus(String color, int noOfWheels, String model, int noOfPassengers) {
		super(color, noOfWheels, model);
		this.noOfPassengers = noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	
}
