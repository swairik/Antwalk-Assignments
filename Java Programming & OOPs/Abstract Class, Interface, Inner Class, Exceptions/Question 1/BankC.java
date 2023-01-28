public class BankC extends Bank {

	BankC() {
		setBalance(200);
	}

	@Override
	public void getBalance() {
		System.out.println("Balance of Bank C : " + this.balance);
	}

}
