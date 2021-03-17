package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		
		IntStream is = Arrays.stream(intArray);
		is.asDoubleStream().forEach(new DoubleConsumer() {

			@Override
			public void accept(double value) {
				System.out.println(value);
			}
			
		});
		
		is.forEach(new IntConsumer() {

			@Override
			public void accept(int value) {
				System.out.println(value);

			}
			
		});
		
		is.boxed().forEach(new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				System.out.println(t.intValue());

			}
			
		});
		
		
	}

}
