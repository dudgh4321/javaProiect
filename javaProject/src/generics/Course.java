package generics;

class Person {
	String name; // 필드

	public Person(String name) { // 생성자
		this.name = name;
	}

	String getName() { // 메소드
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;

	}
	
}

//person을 상속받는 worker라는 클래스
class Worker extends Person {
	Worker(String name) {
		super(name);
	}
}

//person을 상속받는 student 클래스
class Student extends Person {
	Student(String name) {
		super(name);
	}
}

class HighStudent extends Student {
	HighStudent(String name) {
		super(name);
	}
}

// 수업과정
//person을 상속받는 student 클래스
public class Course<T> {
	String courseName;
	T[] students;

	Course(String courseName, int capacity) {
		this.courseName = courseName;
		students = (T[]) new Object[capacity];
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			students[i] = t;
			break;
		}
	}

	public String getCourseName() {
		return this.courseName;
	}

	public T[] getStudents() {
		return this.students;
	}
}