package test;

public class A {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 25; i++) {
			System.out.printf("%3d", i);
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
			i = i + 4;
		} // 1~25 가로 순서대로
		
		System.out.println("==========================");

		for (int i = 1; i <= 5; i++) {
			System.out.printf("%3d", i);
			for (int j = 1; j <= 20; j++) {
				j = j + 4;
				System.out.printf("%3d", i + j);
			}
			System.out.println();

		} // 1~25 세로 순서대로
		
		System.out.println("==========================");

		for (int i = 5; i <= 25; i++) {
			System.out.printf("%3d", i);
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%3d", i - j);
			}
			System.out.println();
			i = i + 4;

		} // 1~25 가로 거꾸로
		
		System.out.println("==========================");
		
		for (int i = 21; i >= 1; i--) {
			System.out.printf("%3d", i);
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
			i = i - 4;

		} // 1~25 세로 거꾸로
	}

}
