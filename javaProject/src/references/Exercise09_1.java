package references;

import java.util.Scanner;

public class Exercise09_1 {

	public static void main(String[] args) {
		boolean run = true;
	      int studentNum = 0;
	      int[] scores = null;
	      Scanner sc = new Scanner(System.in);

	      while (run) {
	         System.out.println("--------------------------------------------------");
	         System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
	         System.out.println("--------------------------------------------------");
	         System.out.print("선택 >> ");

	         int select = sc.nextInt();

	         if (select == 1) {
	            System.out.print("학생수> ");
	            studentNum = sc.nextInt();
	            scores = new int[studentNum];
	            

	         } else if (select == 2) {
	            
	            for (int i = 0; i < studentNum; i++) {
	               System.out.print("scores" + "[" + i + "]" + ": " + "> ");
	               scores[i] = sc.nextInt();
	            }

	         } else if (select == 3) {
	            for (int i = 0; i < studentNum; i++) {
	               System.out.println("scores" + "[" + i + "]" + ": " + "> " + scores[i]);
	            }

	         } else if (select == 4) {
	            int maxScore = 0;
	            int sumScores = 0;
	            for (int i = 0; i < studentNum; i++) {
	               if (maxScore < scores[i]) {
	                  maxScore = scores[i];
	               }

	               sumScores = sumScores + scores[i];
	            }
	            double avg = (double) sumScores / studentNum;
	            System.out.println("최고점수 : " + maxScore);
	            System.out.println("평균점수 : " + avg);

	         } else if (select == 5) {
	            run = false;
	         }
	      }

	   }

	}

}
