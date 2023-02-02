package day9;

@FunctionalInterface
interface MethodRefInterface {
	Person getPerson(String name, int age);
}

public class MethodRefAssignment {
	public static void main(String[] args) {
		MethodRefInterface obj = Person :: new;
		System.out.println(obj.getPerson("Peter", 25));

	}

}
