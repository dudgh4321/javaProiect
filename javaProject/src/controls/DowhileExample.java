package controls;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// =사용자가 입력하는 키보드란 의미
		String str = sc.nextLine();
		boolean run = true;

		do {
			System.out.println(">");
			str = sc.nextLine();
			System.out.println(">>>" + str);

		} while (!str.equals("q"));
		System.out.println("프로그램종료");
	}
}