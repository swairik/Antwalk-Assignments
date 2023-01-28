public class TesterBank {

	public static void main(String[] args) {
		Bank a = new BankA();
		Bank b = new BankB();
		Bank c = new BankC();

		a.getBalance();
		b.getBalance();
		c.getBalance();
	}

}
