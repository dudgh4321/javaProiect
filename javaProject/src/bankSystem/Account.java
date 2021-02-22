package bankSystem;

public class Account {
	static int index = 0;
	public String accountNum;
	public String name;
	int balance;

	public Account(String accountNum, String name, int balance) {

		this.accountNum = accountNum;
		this.name = name;
		this.balance = 0;

	}
}
