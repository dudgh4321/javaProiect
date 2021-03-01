package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[][] scores = null;
		int[] sum=null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.리스트 | 4.조회  | 5.영어최고점 | 6.합계최고 | 7.수합평균점이상 | 8.종료");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.print("선택 >> ");

			int menu = sc.nextInt();

			if (menu == 1) {
				int stnch = 0; // 학생 수 입력 체크 확인 변수
				if (stnch > 0) {
					System.out.println("이미 입력했습니다.");
				} else {
					System.out.print("학생수> ");
					studentNum = sc.nextInt();
					scores = new int[studentNum][3];
					stnch++;
				}

			} else if (menu == 2) {
				int scorech = 0; // 점수 입력 체크 확인 변수
				if (scorech > 0) {
					System.out.println("이미 입력했습니다.");
				} else {
					sum = new int[scores.length];
					for (int i = 0; i < scores.length; i++) {

						System.out.print("학생번호>> ");
						scores[i][0] = sc.nextInt();
						System.out.print("영어점수 >> ");
						scores[i][1] = sc.nextInt();
						System.out.print("수학점수 >> ");
						scores[i][2] = sc.nextInt();
						sum[i] = scores[i][1] + scores[i][2];
						scorech++;
					}
				}
			} else if (menu == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println(
							"학생정보 - 번호 : " + scores[i][0] + ", 영어 : " + scores[i][1] + ", 수학 : " + scores[i][2]);
				}
			} else if (menu == 4) {
				System.out.print("찾고자 하는 학생번호 입력 >>");
				int chNo = sc.nextInt();
				int stNo = 0; // 학생번호 확인 변수
				for (int i = 0; i < scores.length; i++) {

					if (scores[i][0] == chNo) {
						System.out.print(" 학생정보 >> 번호 : " + scores[i][0]);
						System.out.print(", 영어 : " + scores[i][1]);
						System.out.println(", 수학 : " + scores[i][2]);
						stNo++;
					}
				}
				if (stNo == 0)
					System.out.println("해당하는 학생번호가 없습니다.");

			} else if (menu == 5) {
				int maxEngScore = 0;
				int maxEngNo = 0; // 영어 성적 최고점 학생 번호

				for (int i = 0; i < scores.length; i++) {
					if (maxEngScore < scores[i][1]) {
						maxEngScore = scores[i][1];
						maxEngNo = scores[i][0];
					}
				}
				System.out.print("영어최고점 : 학생번호 - " + maxEngNo);
				System.out.println(" - 영어 : " + maxEngScore);

			} else if (menu == 6) {
				double[] avg = null; // 각 학생의 전체 평균점수
				double maxavg = 0; // 최고 평균 점수
				int maxavgNo = 0; // 최고 평균점수 받은 학생 번호

				for (int i = 0; i < scores.length; i++) {
					
					avg = new double[scores.length]; // 각 학생의 영어,수학 점수 합
					avg[i] = (double) sum[i] / 2.0; // 각 학생의 평균점수

					if (maxavg < avg[i]) {
						maxavg = avg[i];
						maxavgNo = scores[i][0];
					}
				}
				System.out.print("학생번호 : " + maxavgNo);
				System.out.println(" 평균점수 : " + maxavg);

			} else if (menu == 7) {
				int mathsum = 0; // 전체 학생 수학 점수 합
				for (int i = 0; i < scores.length; i++) {
					mathsum += scores[i][2];
				}
				double mathavg = (double) mathsum / scores.length;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i][2] >= mathavg) {
						System.out.print("학생번호 : " + scores[i][0]);	
						System.out.println(", 수학점수 : " + scores[i][2]);
					}
				}

			} else if (menu == 8) {
				break;

			}

		}

	}

}
