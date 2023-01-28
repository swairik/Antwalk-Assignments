public class Tester {
	public static void main(String[] args) {
		ContractEmployee c = new ContractEmployee(101, "Peter", 650, 12.5f);
		PermanentEmployee p = new PermanentEmployee(202, "Bruce", 540, 25, 7);

		c.calculateSalary();
		p.calculateMonthlySalary();

		System.out.println("The monthly salary for contract employee is " + c.getSalary());

		System.out.println("The monthly salary for permanent employee is " + p.getSalary());
	}
}
