public class TesterCalculator {
	public static void print(int n) {
		if (n == -1) {
			System.out.println("N is over 1000");
			return;
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		MyCalculator c = new MyCalculator();

		print(c.divisor_sum(12));
		print(c.divisor_sum(1212));

	}
}
