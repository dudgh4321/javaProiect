package controls;

import java.util.Scanner;

public class Exercise00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int SUM = getSumValue(num1, num2);
		
		System.out.println(num1 + " ~ " + num2 + "까지의 합 :" + SUM);
	}

	public static int getSumValue(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++)
			sum = sum + i;

		return sum;
	}
}
