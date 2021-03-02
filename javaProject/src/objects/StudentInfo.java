package objects;

public class StudentInfo {
	
	 String studentName;
	 int math;
	 int eng ;
	 public StudentInfo() {
	 
	 }

	void showInfo() {
		System.out.println("이름 : " + studentName + ",영어 :" + eng + ", 수학" + math);
	}
	public StudentInfo(String studentName, int math, int eng) {
		super();
		this.studentName = studentName;
		this.math = math;
		this.eng = eng;

	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

}
