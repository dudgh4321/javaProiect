package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

public class StreamPipeExample2 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(//
				new Member("hong", Member.MALE, 30),//
				new Member("kim", Member.FEMALE, 31),//
				new Member("shin", Member.MALE, 10),//
				new Member("park", Member.FEMALE, 20)//
	);
	OptionalDouble result =list.stream() //Stream<Member>
	.mapToInt(new ToIntFunction<Member>(){
		@Override
		public int applyAsInt(Member t) {
			return t.getAge();
		}
		
	}).filter(new IntPredicate() {
		@Override
		public boolean test(int value) {
			return value>=30;
		}
		
	}).average();
	result.orElse(0);
	
	System.out.println(result.orElse(0));
	} 
}
