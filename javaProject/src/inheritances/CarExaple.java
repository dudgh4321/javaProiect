package inheritances;

public class CarExaple {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i=0; i<7; i++) {
			car.run();
			int problemLocation = car.run()	;
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire 교체");
				car.frontLeft = new HankookTire("앞왼쪽", 10);
				break;
			case 2: 
				System.out.println("앞오른쪽 KumhoTire 교체");
				car.frontRight = new KumhoTire("앞오른쪽", 12);
			case 3:
				System.out.println("뒤왼쪽 HankookTire 교체");
				car.backLeft = new HankookTire("뒤왼쪽", 15);
			case 4: 
				System.out.println("뒤오른쪽 KumhoTire 교체");
				car.backRight = new KumhoTire("뒤오른쪽", 20);

			}
			System.out.println("================================");
			
		}
		System.out.println("프로그램 종료.");
	}
	

}
