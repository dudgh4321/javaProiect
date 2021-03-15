package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores =new TreeSet<>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		score = scores.first();
		System.out.println(scores);
		score= scores.last();
		System.out.println(scores);
		score = scores.lower(new Integer(95));
		System.out.println(scores);
		score = scores.higher(new Integer(95));
		System.out.println(scores);
		score = scores.floor(new Integer(95));
		System.out.println(scores);
		score = scores.ceiling(new Integer(85));
		System.out.println(scores);
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수: "+ scores.size() +")");
		}
	
				
		
		
		Iterator<Integer> iter = scores.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			System.out.println(i);
		}
		
	}

}
