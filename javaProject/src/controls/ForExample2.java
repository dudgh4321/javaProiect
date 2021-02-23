package controls;

public class ForExample2 {

	public static void main(String[] args) {
		for (int a = 2; a < 10; a++) {
			showResult(a);
		}
	}

	public static void showResult(int num) {
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));

		}
	}
}
