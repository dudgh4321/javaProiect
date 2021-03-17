package streams;

import java.util.Arrays;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

public class AggregateExample {

	public static void main(String[] args) {
		long count = Arrays.stream(new int[] { 1, 2, 3, 4 })
				.filter(new LongPredicate() {

					@Override
					public boolean test(long value) {
						return false;
					}

		
			}).count();

		
	long sum = Arrays.stream(new int[] {1,2,3,4,5})
			.fliter()
	}

}
