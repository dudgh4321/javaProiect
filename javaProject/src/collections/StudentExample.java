package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1, "홍길동"), 90); //키 값은 같지만 인스턴스가 다름
		map.put(new Student(2, "김민수"), 85);  // !==
		map.put(new Student(1, "홍길동"), 92); //
		
		Set<Student> set = map.keySet();
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student.toString());
		}
//		Set<Student, Integer> set = new HashSet<E>();
		
	}	

}
