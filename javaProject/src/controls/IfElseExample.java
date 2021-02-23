package controls;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		String grade = "F";
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
			System.out.println(grade + "등급입니다.");
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
			System.out.println(grade + "등급입니다.");
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
			System.out.println(grade + "등급입니다.");
		} else {
			System.out.println(grade + "등급입니다.");
		}
	}

}
