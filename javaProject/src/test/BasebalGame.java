package test;

import java.util.Random;
import java.util.Scanner;

public class BasebalGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] array1 = { random.nextInt(9)+1, random.nextInt(9)+1, random.nextInt(9)+1};
		int[] array2 = new int[3];
		int ball = 0;
		int strike = 0;
		
		System.out.println("숫자야구게임 시작!");
		while (strike != 3) {
			for (int i = 0; i < 3; i++) {
				System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
				array2[i] = sc.nextInt();
			} // 숫자 입력받기

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (array1[i] == array2[j] && i != j) {
						ball++;
					} else if (array1[i] == array2[j] && i == j) {
						strike++;
					}
				}
			} // 숫자 비교
			if(strike==3) {
				System.out.println("정답입니다.");
				System.out.println("("+array1[0]+","+array1[1]+","+array1[2]+")");
				break;
			}else 
			System.out.println(strike + " Strike / " + ball + " Ball");
			System.out.println();
			ball = 0; strike= 0;
			\\
		}
	}
}
