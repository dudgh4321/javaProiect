package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Fruit{
	int price;
	public Fruit(int price) {
		this.price = price;
	}
	
}
public class HashSetExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(100);
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer result = iter.next();
			System.out.println(result);
		}
		

		Set<Fruit> fruit = new HashSet<>();
		Fruit apple = new Fruit(1000);
		Fruit tomato = new Fruit(2000);
		Fruit grape = new Fruit(3000);
		
		fruit.add(apple);
		fruit.add(grape);
		fruit.add(tomato);
		Iterator<Fruit> iter1 = fruit.iterator();
		while(iter1.hasNext()) {
			Fruit f = iter1.next();
			System.out.println(f.price);
		}
		
		
	}
}
