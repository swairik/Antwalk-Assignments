package day4;

public class Calculator {
	public static float average(float n1, float n2, float n3) {
		return (n1 + n2 + n3) / 3;
	}
	
	public static float average(float n1, float n2, float n3, float n4) {
		return (n1 + n2 + n3 + n4) / 4;
	}
	
	public static float average(float n1, float n2, float n3, float n4, float n5) {
		return (n1 + n2 + n3 + n4 + n5) / 5;
	}
	
	public static void printer(float val) {
		System.out.format("%.2f\n", val);
	}
	
	public static void main(String[] args) {
		printer(average(1.1f, 2.2f, 3.3f));
		printer(average(1.1f, 2.2f, 3.3f, 4.4f));
		printer(average(1.1f, 2.2f, 3.3f, 4.4f, 5.5f));
	}

}
