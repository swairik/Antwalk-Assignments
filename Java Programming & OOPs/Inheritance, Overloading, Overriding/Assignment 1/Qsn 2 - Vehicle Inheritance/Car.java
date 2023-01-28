package day4;

public class Car extends Vehicle{
	private String type;

	public Car(String color, int noOfWheels, String model, String type) {
		super(color, noOfWheels, model);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
