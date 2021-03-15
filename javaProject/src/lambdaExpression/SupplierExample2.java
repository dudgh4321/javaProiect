package lambdaExpression;

import java.util.Scanner;
import java.util.function.Supplier;

class Member {
	String name;
	int score;

	Member(String name, int score) {
		this.name = name;
		this.score = score;

	}
}

public class SupplierExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Supplier<Member> sup = () -> {
			int cnt = 0;
			int maxscore = 0;
			String maxname = null;
			while (true) {
				System.out.print("이름을 입력해주세요> ");
				String name = sc.nextLine();
				System.out.print("점수을 입력해주세요> ");
				int score = sc.nextInt();
				sc.nextLine();
				if (maxscore < score) {
					maxscore = score;
					maxname = name;
				}
				if (cnt++ == 2) {
					break;
				}
			}
			return new Member(maxname, maxscore);
		};
		Member m1 = sup.get();
		System.out.println(m1);
	}
}
