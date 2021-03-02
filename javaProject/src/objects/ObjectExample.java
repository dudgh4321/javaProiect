package objects;

public class ObjectExample {

	public static void main(String[] args) {

		Student student = new Student(); 
		// 객체 생성 new Student 객체를 생성해서 Student 타입의 student 변수에 할당
		student.studentNo = " s12345 ";
		student.grade = 2;
		student.eng = 80;
		student.math = 85;
		student.study();
		student.run();
		student.introduce();
	

	}
}
