package yedamTest;

public class Student {
	public static int Index =0;
	private int stdNo;
	private String name;
	private int age;
	private String major;

	public Student(int stdNo, String name, int age, String major) {
		super();
		this.stdNo = stdNo;
		this.name = name;
		this.age = age;
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [학번=" + stdNo + ", 이름=" + name + ", 나이=" + age + ", 전공=" + major + "]";
	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
