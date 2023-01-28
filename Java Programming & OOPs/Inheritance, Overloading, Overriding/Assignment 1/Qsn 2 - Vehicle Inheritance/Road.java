package day4;

public class Road {

	public static void main(String[] args) {
		Truck truck = new Truck("Brown", 8, "Mahindra", 20000);
		Bus bus = new Bus("Blue", 6, "Volvo", 60);
		Car car = new Car("Red", 4, "Ferrari", "Sports Car");
		
		System.out.println("Truck Details : ");
		truck.display();
		System.out.println("Load Weight : " + truck.getWeightOfLoad());
		
		System.out.println();
		
		System.out.println("Bus Details : ");
		bus.display();
		System.out.println("No of passengers : " + bus.getNoOfWheels());
		
		System.out.println();
		
		System.out.println("Car Details : ");
		car.display();
		System.out.println("Type of Car : " + car.getType());
	}

}
