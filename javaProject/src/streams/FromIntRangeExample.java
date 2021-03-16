package streams;

import java.util.stream.IntStream;

public class FromIntRangeExample {

	public static void main(String[] args) {
		IntStream is = IntStream .rangeClosed(10, 20);
		is.forEach(v -> System.out.println(v));
	
		IntStream is1 = IntStream .rangeClosed(15, 30);
		int sum = 0;
		 
		System.out.println(is1.sum());
	
		
	
	
	
	}

}
