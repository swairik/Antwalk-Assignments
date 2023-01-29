public class AssignmentGenerics {
	public static <T> void print(Generic<T[]> a) {
		for (T obj : a.container) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		Generic<Integer[]> a = new Generic<Integer[]>();
		Generic<String[]> b = new Generic<String[]>();
		Generic<Double[]> c = new Generic<Double[]>();

		Integer Iarr[] = new Integer[] { 1, 2, 3 };
		String Sarr[] = new String[] { "a", "b", "c" };
		Double Darr[] = new Double[] { 1.5, 2.5, 3.5 };

		a.container = Iarr;
		b.container = Sarr;
		c.container = Darr;

		print(a);
		print(b);
		print(c);
	}

}
