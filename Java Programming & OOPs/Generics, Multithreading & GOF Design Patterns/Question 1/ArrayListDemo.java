import java.util.*;

public class ArrayListDemo {

	public static int find(List<Employee> e, int empno) {
		int pos = -1;
		for (int i = 0; i < e.size(); i++) {
			Employee emp = e.get(i);
			if (emp.getEmpno() == empno) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public static void insert(List<Employee> e) {
		Scanner sin = new Scanner(System.in);
		int empno, salary;
		String name;

		System.out.print("Enter empno : ");
		empno = Integer.parseInt(sin.nextLine());

		System.out.print("Enter name : ");
		name = sin.nextLine();

		System.out.print("Enter salary : ");
		salary = Integer.parseInt(sin.nextLine());

		Employee emp = new Employee(empno, name, salary);

		e.add(new Employee(empno, name, salary));
	}

	public static void display(List<Employee> e) {
		Iterator itr = e.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void search(List<Employee> e) {
		Scanner sin = new Scanner(System.in);
		int empno;
		System.out.print("enter empno : ");
		empno = Integer.parseInt(sin.nextLine());
		;
		int pos = find(e, empno);
		if (pos == -1) {
			System.out.println("Employee not found!!!");
		} else {
			System.out.println(e.get(pos));
		}
	}

	public static void delete(List<Employee> e) {
		Scanner sin = new Scanner(System.in);
		int empno;
		System.out.print("enter empno : ");
		empno = Integer.parseInt(sin.nextLine());
		;
		int pos = find(e, empno);
		if (pos == -1) {
			System.out.println("Employee not found!!!");
		} else {
			e.remove(pos);
			System.out.println("Employee successfully deleted");
		}
	}

	public static void update(List<Employee> e) {
		Scanner sin = new Scanner(System.in);
		int empno;
		System.out.print("enter empno : ");
		empno = Integer.parseInt(sin.nextLine());
		;
		int pos = find(e, empno);
		if (pos == -1) {
			System.out.println("Employee not found!!!");
		} else {
			String name;
			int salary;
			System.out.print("Enter new name : ");
			name = sin.nextLine();
			System.out.print("Enter new salary : ");
			salary = Integer.parseInt(sin.nextLine());
			;

			e.set(pos, new Employee(empno, name, salary));

			System.out.println("Employee updated successfully");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int choice = -1;

		List<Employee> employees = new ArrayList<>();

		while (true) {
			System.out.println("Enter 1 to insert");
			System.out.println("Enter 2 to display");
			System.out.println("Enter 3 to search");
			System.out.println("Enter 4 to delete");
			System.out.println("Enter 5 to update");
			System.out.println("Enter 0 to exit");
			System.out.print("Enter choice : ");
			choice = Integer.parseInt(in.nextLine());
			;

			switch (choice) {
				case 1:
					insert(employees);
					break;
				case 2:
					display(employees);
					break;
				case 3:
					search(employees);
					break;
				case 4:
					delete(employees);
					break;
				case 5:
					update(employees);
					break;

				case 0:
					System.exit(0);

				default:
					break;
			}
		}

	}

}
