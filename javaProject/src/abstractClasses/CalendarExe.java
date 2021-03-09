package abstractClasses;

import java.util.Calendar;

public class CalendarExe {

	public static void main(String[] args) {
		showCal(2021, 3);
		
	}

	public static void showCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, (month-1), 1);
		int lastDate = cal.getActualMaximum(Calendar.DATE); // 그 달의 마지막일수
		int firstDate = cal.get(Calendar.DAY_OF_WEEK);
		
		for(int i=0; i<7; i++) {
			System.out.println();
		}
		
		for (int i = 1; i < firstDate; i++) {
			System.out.printf("%3s", " ");
		}
		for (int i = 1; i <= lastDate; i++) {
			if ((i + firstDate - 1) % 7 == 0) {
				System.out.printf("%3d", i);
				System.out.println();
			} else
				System.out.printf("%3d", i);
		}
	}
}