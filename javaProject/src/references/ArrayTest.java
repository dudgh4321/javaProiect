package references;

public class ArrayTest {

	public static void main(String[] args) {
		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };
		for (String name : names) {
			System.out.print(name+ "\t");

		}
		System.out.println();
		for (int score : scores) {
			System.out.print(score + "\t");
		}

	}

}
