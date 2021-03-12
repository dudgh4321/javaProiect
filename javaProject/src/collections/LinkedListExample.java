package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		 
		 long startTime, endTime;
		 startTime = System.nanoTime();
		 for(int i=0; i<100000; i++) {
			 list.add(0, String.valueOf(i));
		 }
		 endTime = System.nanoTime();
		 System.out.println("걸린시간:" + (endTime - startTime));
		 
		 
		 startTime = System.nanoTime();
		 list = new LinkedList<>();
		 for(int i=0; i<100000; i++) {
			 list.add(0, String.valueOf(i));
		 }
		 endTime = System.nanoTime();
		 System.out.println("걸린시간:" + (endTime - startTime));
		 
	
	}

}
