package object2;

import objects.Student;

public class MethodExample {
	public static void main(String[] args) {
		
		for(int i =0; i<args.length; i++) {
			System.out.println("매개값[" + i + "]" + args[i]);
		}
		
		Calculator.getRect(4.5, 1);
		
		Calculator cal = new Calculator();
		cal.getArea(3.5); 	
		
		
		Book b1 = new Book("", "", "", 100);
		Student s1 = new Student();
		s1.study();
		s1.run();
	}

	
}
