package bankSystem;

import java.util.Scanner;

public class BankAccount {
	private static Account[] ac = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	
	static String accNum;
	static String name;
	static int money = 0;

	public static void main(String[] args) {

		while (true) {

			System.out.println("=========은행 업무 관리 프로그램=========");
			System.out.println("1. 계좌생성 ");
			System.out.println("2. 입금 ");
			System.out.println("3. 출금 ");
			System.out.println("4. 잔액조회 ");
			System.out.println("5. 모든 계좌 조회 ");
			System.out.println("6. 프로그램 종료");
			System.out.println("===================================");
			System.out.print("원하는 번호 입력 : ");
			
			int ch = 0;
			ch = sc.nextInt();

			if (ch == 1) {
				createAccount();

			} else if (ch == 2) {
				deposit();

			} else if (ch == 3) {
				withdraw();

			} else if (ch == 4) {
				blanceCheck();

			} else if (ch == 5) {
				accountList();

			} else {
				break;
			}
		}

		System.out.println("이용해주셔서 감사합니다.");

	}

	private static void createAccount() {
		System.out.println("계좌등록합니다.");
		System.out.print("이름 : ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("계좌번호 : ");
		accNum = sc.nextLine();

		ac[Account.accIndex] = new Account(name, accNum, 0);

		System.out.println("성공적으로 등록되었습니다.");
		Account.accIndex++;

	}

	private static void deposit() {
		System.out.print("입금하실 계좌번호 : ");
		sc.nextLine();
		accNum = sc.nextLine();
		System.out.print("입금하실 금액 : ");
		money = sc.nextInt();

		for (int i = 0; i < Account.accIndex; i++) {

			if ((ac[i].getAccNum()).equals(accNum)) {
				ac[i].totalMoney += money;
			}
		}

	}

	private static void withdraw() {
		System.out.print("출금하실 계좌번호 : ");
		sc.nextLine();
		accNum = sc.nextLine();
		System.out.print("출금하실 금액 : ");
		money = sc.nextInt();

		for (int i = 0; i < Account.accIndex; i++) {

			if ((ac[i].getAccNum()).equals(accNum)) {
				ac[i].totalMoney -= money;
			}
		}
	}

	private static void blanceCheck() {
		System.out.print("잔액조회 계좌번호 : ");
		sc.nextLine();
		accNum = sc.nextLine();

		for (int i = 0; i < Account.accIndex; i++) {

			if ((ac[i].getAccNum()).equals(accNum)) {
				System.out.println("잔액: " + ac[i].getTotalMoney());
			}
		}
	}

	private static void accountList() {
		System.out.println("모든계좌조회");

		for (int i = 0; i < Account.accIndex; i++) {
			System.out.println(
					(i + 1) + "번 : " + ac[i].getName() + " , 계좌번호: " + ac[i].getAccNum() + " , 잔액: " + ac[i].getTotalMoney());
		}

	}
}
