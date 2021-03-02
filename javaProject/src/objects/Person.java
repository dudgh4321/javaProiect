package objects;

public class Person {
	String name;
	int age;
	int weight;
	int height;
	
	void eat() {
		System.out.println("먹습니다");
	}
	void sleep() {
		System.out.println("잠을 잡니다");
	}
	void walk( ) {
		System.out.println("걷습니다");
	}
	void introduce() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 몸무게 : " + weight + ", 키 : "+ height);
	}
	
	public Person(String name, int age, int weight, int height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
}
