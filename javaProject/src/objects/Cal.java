package objects;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showInfo("홍길동");
		showInfo("김길동"); //문자
		
		StudentInfo std = new StudentInfo(); // std 변수를 매개값으로받는
		std.setStudentName("박소현");
		showInfo(std);
		std.setEng(90);
		std.setMath(95);
		showInfo(std);
		
		StudentInfo[] stds = new StudentInfo[3]; // 배열을 매개값으로 받는
		
		stds[0] = new StudentInfo("김영호", 77, 88);
		stds[1] = new StudentInfo("이영호", 79, 89);
		stds[2] = new StudentInfo("박영호", 72, 86);
		showInfo(stds);

	}
	public static void showInfo(StudentInfo[] students) {
		for(StudentInfo std : students) {
			if(std != null) {
				showInfo(std);
			}
				
		}
	}
	
	public static void showInfo(StudentInfo student) {
		System.out.println(student.getStudentName() + "님 안녕하세요.");
		System.out.println("영어점수는 " + student.getEng() + ", 수학점수는 " + student.getMath());
	}
	
	public static void showInfo(String name) {
		System.out.println(name+"님 안녕하세요");
	}
}
