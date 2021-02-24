package controls;

import java.util.Scanner;

public class Morning0225_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = getSum(a,b);
		System.out.println(a + " ~ " + b+ " 까지의 합 : " + result);

	}
	
	public static int getSum(int a, int b) {			
		int sum = 0;
	
		for (int i = a; i <= b; i++) {
			sum = sum + i;
		} return sum;
	
	}
}
