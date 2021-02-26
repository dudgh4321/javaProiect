package references;

import java.util.Calendar;

enum Kind {
	MALE, FEMALE;
}

enum Choice {
	YES, NO;
}

public class EnumEXample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 남자 ,2 여자
		int yesOrNo = 1; // 1 yes, 2 no
		Kind manOfWoman = Kind.FEMALE;
//		
//		Week today = null;
//		today = Week.SUNDAY;
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.getWeekYear());
//		System.out.println(Calendar.MONTH);
//		System.out.println(Calendar.DAY_OF_MONTH);
//		System.out.println(Calendar.DAY_OF_WEEK);
//		System.out.println();
//
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 일
//		System.out.println(cal.get(Calendar.AM));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 요일
//
//		int week = cal.get(Calendar.DAY_OF_WEEK);
//		
//		
//		switch (week) {
//		case 1:
//			today = Week.SUNDAY;
//			break;
//		case 2:
//			today = Week.MONDAY;
//			break;
//		case 3:
//			today = Week.TUESDAY;
//			break;
//		case 4:
//			today = Week.WEDNESDAY;
//			break;
//		case 5:
//			today = Week.THURSDAY;
//			break;
//		case 6:
//			today = Week.FRIDAY;
//			break;
//		case 7:
//			today = Week.SATURDAY;
//			break;
//		}
////		if(today == Week.SUNDAY || today == Week.SATURDAY) {
//		if(week == 1 || week ==2) {
//		System.out.println("주말에는 여행을 갑니다.");
//		}else {
//			System.out.println("주중에는 공부를합니다.");
//
//		}
//		
//		
//			
//		}
			if(manOfWoman == Kind.FEMALE) {
				System.out.println("여성입니다.");
	}

}
}
