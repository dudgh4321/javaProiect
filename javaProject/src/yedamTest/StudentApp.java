package yedamTest;

import java.util.Scanner;

public class StudentApp {

	private static Student[] students = new Student[100];
	private static Scanner sc = new Scanner(System.in);

	static int stdNo = 0;
	static String name;
	static int age = 0;
	static String major;

	public static void main(String[] args) {

		while (true) {

			System.out.println("=========학생 정보 관리 프로그램=========");
			System.out.println("1. 학생정보등록 ");
			System.out.println("2. 학생전공수정 ");
			System.out.println("3. 학생정보삭제 ");
			System.out.println("4. 학생정보 전체리스트 ");
			System.out.println("5. 종료 ");
			System.out.println("===================================");
			System.out.print("원하는 번호 입력 : ");

			int ch = 0;
			ch = sc.nextInt();
			sc.nextLine();

			if (ch == 1) {
				System.out.println("학생정보를 등록합니다.");
				System.out.print("학번 : ");
				stdNo = sc.nextInt();
				sc.nextLine();
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("나이 : ");
				age = sc.nextInt();
				sc.nextLine();
				System.out.print("전공 : ");
				major = sc.nextLine();

				students[Student.Index] = new Student(stdNo, name, age, major);

				System.out.println("성공적으로 등록되었습니다.");

				Student.Index++;
			} else if (ch == 2) {
				System.out.print("수정할 학생의 학번입력 : ");
				int stdNo = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < Student.Index; i++) {
					if (stdNo == students[i].getStdNo()) {
						System.out.print("변경된 전공을 입력하세요 : ");
						String modifyMajor = sc.nextLine();
						students[i].setMajor(modifyMajor);
						System.out.println("성공적으로 수정되었습니다.");
					}
				}
				
			} else if (ch == 3) {
				System.out.print("삭제할 학생의 학번입력 : ");
				int delIdx = sc.nextInt();
				for (int j = 0; j < Student.Index; j++) {
					if (delIdx == students[j].getStdNo()) {
						for (int i = delIdx; i < Student.Index; i++) {
							students[i] = students[i + 1];
						}
						Student.Index = Student.Index - 1;
					}
				}
				System.out.println("성공적으로 삭제되었습니다.");

			} else if (ch == 4) {
				System.out.println("전체 학생 리스트");
				
				for(int i = 0; i<Student.Index; i++) {
					System.out.println(students[i].toString());
				}
				
			} else if (ch == 5) {
				System.out.println("종료합니다.");
				break;
			}

		}

	}
}
