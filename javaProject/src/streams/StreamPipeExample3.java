package streams;

import java.util.Arrays;
import java.util.List;

public class StreamPipeExample3 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(//
				new Member("hong", Member.MALE, 30), //
				new Member("hong", Member.MALE, 30), //
				new Member("hong", Member.FEMALE, 30), //
				new Member("hong", Member.MALE, 30), //
				new Member("kim", Member.FEMALE, 31), //
				new Member("shin", Member.MALE, 10), //
				new Member("park", Member.FEMALE, 20)//
		);

		list.stream().distinct().forEach(System.out::println);
		
		
	}

}
