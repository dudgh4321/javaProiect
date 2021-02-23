package bankSystem;

import java.util.Scanner;

public class BankAccount { // 다때려박는 버전

	public static void main(String[] args) {

		Account[] ac = new Account[5];
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		String accNum;
		String name;
		int money = 0;

		while (true) {

			System.out.println("=========은행 업무 관리 프로그램=========");
			System.out.println("1. 계좌등록 ");
			System.out.println("2. 입금 ");
			System.out.println("3. 잔액조회 ");
			System.out.println("4. 모든 계좌 조회 ");
			System.out.println("5. 프로그램 종료");
			System.out.println("===================================");
			System.out.print("원하는 번호 입력 : ");

			ch = sc.nextInt();

			if (ch == 1) {
				System.out.println("계좌등록합니다.");
				System.out.print("이름 : ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.print("계좌번호 : ");
				accNum = sc.nextLine();

				ac[Account.accIndex] = new Account(name, accNum, 0);

				System.out.println("성공적으로 등록되었습니다.");
				Account.accIndex++;

			} else if (ch == 2) {
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

			} else if (ch == 3) {
				System.out.print("잔액조회 계좌번호 : ");
				sc.nextLine();
				accNum = sc.nextLine();

				for (int i = 0; i < Account.accIndex; i++) {

					if ((ac[i].getAccNum()).equals(accNum)) {
						System.out.println(ac[i].getTotalMoney());
					}
				}
			} else if (ch == 4) {
				System.out.println("모든계좌조회");

				for (int i = 0; i < Account.accIndex; i++) {
					System.out.println((i + 1) + "번째 : " + ac[i].getName() + " , " + ac[i].getAccNum() + " , "
							+ ac[i].getTotalMoney());
				}

			} else {
				break;
			}
		}

		System.out.println("이용해주셔서 감사합니다.");

	}

}
