package object2;

public class AccoutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재잔고: " + account.getBalance());
		
		
		
		
	}

}
