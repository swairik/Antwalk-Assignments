public class BankB extends Bank {

	BankB() {
		setBalance(150);
	}

	@Override
	public void getBalance() {
		System.out.println("Balance of Bank B : " + this.balance);
	}

}
