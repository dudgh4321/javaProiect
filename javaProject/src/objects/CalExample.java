package objects;

public class CalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getSum(40, 50));
		
		System.out.println(getAverage(40, 50));
		
		StudentInfo st = new StudentInfo("박소연", 87, 92);
		showInfo(st);
		
	}
	
	public static void showInfo(StudentInfo st) {
		System.out.println("이름 : " + st.studentName);
		System.out.println("합계점수 : " 
						+ getSum(st.eng, st.math));
		System.out.println("평균점수 : " 
						+ getAverage(st.eng, st.math));
		
		
	}

	
	public static int getSum(int num1, int num2) {
		int sum =  num1 + num2;
		return sum;
		
		
	}
	public static double getAverage(int a, int b) {
		int sum = a + b;
		double avg = sum / 2.0;
		return avg;
	}

}
