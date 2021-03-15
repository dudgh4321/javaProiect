package collections;

import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class Person implements Comparable<Person>{
	String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
}

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Person, Integer> tMap = new TreeMap<Person, Integer>();
		tMap.put(new Person("Hong"), 80);
		tMap.put(new Person("wong"), 90);
		tMap.put(new Person("gong"), 70);
		
		NavigableSet<Person> nSet = tMap.navigableKeySet();	
		for (Person person : nSet) {
			System.out.println(person.name);
		}
		System.out.println("============================");
		Set<Entry<Person,Integer>> eSet = tMap.entrySet()	;
		
	}			
}
