package controls;

public class WhileExample2 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		while (a < 10) {
			while (b < 10) {
				System.out.println(a + " * " + b + " = " + a * b);
				b++;
			}
			a++;
			b = 1;

		}

	}

}