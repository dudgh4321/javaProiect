package streams;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "강자바", "신민철", "신용권");
		
		names.stream().distinct().forEach(System.out::println);{
			
			
			
		};
	}

}
