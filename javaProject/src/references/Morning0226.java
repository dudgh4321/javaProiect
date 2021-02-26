package references;

import java.util.Scanner;

public class Morning0226 {

	public static void main(String[] args) {
		int[] mathScores = new int[3];
		int[] engScores = new int[3];
		int mathScoresSum = 0;
		int engScoresSum = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번째 수학성적을 입력하세요");
			mathScores[i] = sc.nextInt();
			System.out.println((i + 1) + "번째 영어성적을 입력하세요");
			engScores[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			mathScoresSum = mathScoresSum + mathScores[i];
			engScoresSum = engScoresSum + engScores[i];
		}
		double mathavg = mathScoresSum / 3.0;
		double engavg = engScoresSum / 3.0;
		
		System.out.println("수학점수");
		for (int i = 0; i < 3; i++) {
		System.out.print((i+1)+"번째 : "+ mathScores[i] + "\t");
		}
		System.out.println("수학평균 : " + mathavg);
		System.out.println("영어점수");
		
		for (int i = 0; i < 3; i++) {
		System.out.print((i+1)+"번째 : "+ engScores[i] + "\t");
		}
		System.out.println("영어평균 : " + engavg);

	}

}
