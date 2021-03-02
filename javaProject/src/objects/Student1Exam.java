package objects;

import java.util.Scanner;

public class Student1Exam {

	public static void main(String[] args) {

		String studentName;
		int math;
		int eng;
		int sum;
		StudentInfo[] students = new StudentInfo[2];

			Scanner sc = new Scanner(System.in);
				for (int i = 0; i < 2; i++) {
					System.out.print("이름> ");
					studentName = sc.nextLine();
					System.out.print("영어점수> ");
					eng = sc.nextInt();
					System.out.print("수학점수> ");
					math = sc.nextInt();
					sc.nextLine();
					sum = eng + math;
					students[i] = new StudentInfo(studentName, eng, math);

				}
				for(StudentInfo student : students) {
					student.showInfo();
				}

		}
}