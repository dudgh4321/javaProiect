package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		OptionalDouble avg =list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if(avg.isPresent()) {
			System.out.println("방법1_평균 : " + avg.getAsDouble());
		}else {
			System.out.println("방법1_평균 : + 0.0 ");

		
		
	}
	}

}
