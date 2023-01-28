public class TesterCity {

	public static void main(String[] args) {
		City c = new City();
		c.setCity(123456, "c1");
		c.setCity(654321, "c2");
		c.setCity(789123, "c3");

		try {
			System.out.println(c.findCity(123456));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
