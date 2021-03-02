package objects;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person1 = new Person();
//		
//		person1.name = "홍길동";
//		person1.age = 30;
//		person1.weight = 70;
//		person1.height = 180;
//		
//		person1.eat();
//		person1.sleep();
//		person1.walk();
//		person1.introduce();		

		Person person2 = new Person("김길동", 20, 70, 180);
		person2.introduce();
		System.out.println(person2);

		Person[] persons = new Person[2];
		persons[0] = new Person("홍길동", 15, 175, 72);
		persons[1] = new Person("김길동", 20, 180, 80);

		for (Person person : persons) {
			if (person.age >= 20) {
				person.introduce();
				
			}
		}

	}

}
