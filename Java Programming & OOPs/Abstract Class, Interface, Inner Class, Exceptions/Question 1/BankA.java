public class BankA extends Bank {

	BankA() {
		setBalance(100);
	}

	@Override
	public void getBalance() {
		System.out.println("Balance of Bank A : " + this.balance);
	}

}
