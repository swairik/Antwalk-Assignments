package day4;

public class Vehicle {
	private String color;
	private int noOfWheels;
	private String model;
	
	public Vehicle(String color, int noOfWheels, String model) {
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void display() {
		System.out.println("Color : " + this.getColor());
		System.out.println("No of Wheels : " + this.getNoOfWheels());
		System.out.println("Model : " + this.getModel());
	}
	
}
