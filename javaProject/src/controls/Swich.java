package controls;

import java.util.Scanner;

public class Swich {

	public static void main(String[] args) {
		int z = (int)(Math.random() * 6)+1; //1~6까지의 int 형태의 임의의 정수
		String grade = "F";
		int score = 80;
		System.out.println(z);
				
		switch (score/10) {
		case 10:
			grade = "A";
			break;
		case 9:
			
			break;
		case 8:
			
			break;
		case 7:
			
			break;
		default :
		
		} System.out.println();
	}

}
