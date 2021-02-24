package controls;

import variables.GetAverageValue;

public class Morning0224 {

	public static void main(String[] args) {

		int n1 = 80;
		int n2 = 90;

		double avg = (n1 + n2) / 2.0;
		if (avg >= 90) {
			System.out.println("수");
		} else if (avg >= 80) {
			System.out.println("우");
		} else if (avg >= 70) {
			System.out.println("미");
		} else {
			System.out.println("가");
		}

	}
}
