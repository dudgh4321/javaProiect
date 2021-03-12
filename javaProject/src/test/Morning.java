package test;

import java.text.NumberFormat;

public class Morning {
	public static void main(String[] args) {
		checkGender("9205311788888");
		checkGender("125844~4815584");
		sum("10000", "23400");
		
	}

	public static void checkGender(String j) {
		if (j.length() == 14) {
			if ((j.charAt(7) == '1') || (j.charAt(7) == '3')) {
				System.out.println("남자");
				;
			} else if ((j.charAt(7) == '2') || (j.charAt(7) == '4')) {
				System.out.println("여자");
			}
		} else if (j.length() == 13) {
			if ((j.charAt(6) == '1') || (j.charAt(6) == '3')) {
				System.out.println("남자");
				;
			} else if ((j.charAt(6) == '2') || (j.charAt(6) == '4')) {
				System.out.println("여자");
			}
		} else {
			System.out.println("입력오류"); 
		}

	}
	
public static void sum(String a, String b) {
	int value1 = Integer.parseInt(a);
	int value2 = Integer.parseInt(b);
	int sum = value1 + value2;
	String result = NumberFormat.getInstance().format(sum);
	System.out.println(result);
	
	
}
	
	

}
