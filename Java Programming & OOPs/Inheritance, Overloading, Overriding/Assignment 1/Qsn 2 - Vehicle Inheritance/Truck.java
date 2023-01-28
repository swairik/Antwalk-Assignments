package day4;

public class Truck extends Vehicle {
	private int weightOfLoad;

	public Truck(String color, int noOfWheels, String model, int weightOfLoad) {
		super(color, noOfWheels, model);
		this.weightOfLoad = weightOfLoad;
	}

	public int getWeightOfLoad() {
		return weightOfLoad;
	}

	public void setWeightOfLoad(int weightOfLoad) {
		this.weightOfLoad = weightOfLoad;
	}
	
	
}
