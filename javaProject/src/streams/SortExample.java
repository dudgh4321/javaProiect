package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortExample {

	public static void main(String[] args) {
		int[] iar = {5,3,2,1,4};
		IntStream is = Arrays.stream(iar);
		is.sorted().forEach(number -> System.out.println(number));
		
		
		
	}

}
