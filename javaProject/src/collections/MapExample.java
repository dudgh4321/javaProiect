package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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
		
		Set<Entry<String ,Integer>> entset = map.entrySet();  // 키 벨류 담는 set 만들고 
		Iterator<Entry<String, Integer>>entIter = entset.iterator(); // set iterator 인터페이스 객체만들고
		while(entIter.hasNext()) {
			Entry<String, Integer> ent = entIter.next();  // set에 담긴 정보를 set iterator를 통해 하나씩 가져오고
			String key = ent.getKey();  // ent에 담긴 정보에서 키값만 따로 가져온다.
			Integer val = ent.getValue(); 
			System.out.println("key" + key + ", val: "+ val);
		}
		
		for(String key : set) {
			Integer val = map.get(key);
			System.out.println(val);
		}
		
	}

}
