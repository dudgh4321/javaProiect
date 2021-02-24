package controls;

public class Morning0224_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math = (int) (Math.random() * 100) + 1;
		int eng = (int) (Math.random() * 100) + 1;

		String result = getAverage(math, eng);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("평균 = " + (eng + math) / 2.0);
		System.out.println("결과는 " + result);
	}

	public static String getAverage(int math, int eng) {

		double avg = (math + eng) / 2.0;
		String grade = "";
		if (avg >= 90) {
			grade = "수";
		} else if (avg >= 80) {
			grade = "우";
		} else if (avg >= 70) {
			grade = "미";
		} else {
			grade = "양";
		}
		return grade;
	}

}