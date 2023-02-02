package day7;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class MapAssignment {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(101, "Bruce", 25000));
		employees.add(new Employee(102, "Peter", 15000));
		employees.add(new Employee(103, "Clark", 5000));
		employees.add(new Employee(104, "Lewis", 45000));
		employees.add(new Employee(105, "Sebastian", 55000));
		
//		List<Employee> updatedEmployeeeList = employees
//												.stream()
//												.map(e -> new Employee(e.id, e.name, e.salary * 1.1))
//												.collect(Collectors.toList());
		
		List<Employee> updatedEmployeeeList = employees
												.stream()
												.map(e -> {e.salary += 0.1 * e.salary; return e;})
												.collect(Collectors.toList());
		
		updatedEmployeeeList.stream().forEach(e -> System.out.println(e));

		System.out.println();
		
		employees.stream().forEach(System.out::println);
		
	}

}
