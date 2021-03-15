package collections.exercise;

public class Student {
	int studentNum;
	String name;

	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum  + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return ((studentNum == student.studentNum) && (name== student.name));
		}else {
			return false;
		}
	}

}
