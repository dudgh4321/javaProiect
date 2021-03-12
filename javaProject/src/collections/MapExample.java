package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<>();
		map.put("홍길동", 15);
		map.put("김민수", 20)	;
		map.put("박소연", 23);
		
		Integer result = map.get("홍길동");
		System.out.println(result);
		
		Map<Integer, String>smap = new HashMap<>();
		smap.get(1);

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String 	Key = iter.next();
			Integer val = map.get(Key);
			System.out.println(val);
		}
		for(String key : set) {
			Integer val = map.get(key);
			System.out.println(val);
		}
		
	}

}
