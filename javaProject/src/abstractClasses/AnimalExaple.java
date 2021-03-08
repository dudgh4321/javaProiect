package abstractClasses;

public class AnimalExaple {

	public static void main(String[] args) {
		
//		Animal animal = new Animal(); 추상클래스는 인스턴스 생성이 불가
		Animal animal = new Bird("조류");
		
		animal.breath();
		animal.sound();
		
		animal = new Cat("포유류");
		animal.breath();
		animal.sound();
	}

}
