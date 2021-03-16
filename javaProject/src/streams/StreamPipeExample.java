package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class StreamPipeExample {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(//
				new Member("hong", Member.MALE, 30), //
				new Member("kim", Member.FEMALE, 31), //
				new Member("shin", Member.MALE, 10), //
				new Member("park", Member.FEMALE, 20)//
		);

		OptionalDouble result = list.stream() // Stream<Member>
				.filter(new Predicate<Member>() {

					@Override
					public boolean test(Member t) {
						return t.getSex() == Member.MALE;
					}
				}).mapToInt(new ToIntFunction<Member>() {

					@Override
					public int applyAsInt(Member t) {
						return t.getAge();
					}

				}).average(); // OptionalDouble  >>최종처리 메소드
		
		System.out.println(result.getAsDouble());
	}
}
