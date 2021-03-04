package object2;

public class Account {
	private int balance = 0;

	public Account() {

	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (0 <= balance && balance < 1000000) {
			this.balance = balance;
		}
	}

}
