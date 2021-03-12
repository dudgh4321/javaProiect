package api;

import java.util.HashMap;

public class UserExample {

	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();

		HashMap<User, String> hashMap = new HashMap<>();
		hashMap.put(user1, "홍길동");
		hashMap.put(user1, "박길동");
		hashMap.put(user1, "김길동");
		
		System.out.println(hashMap.get(user1));
	}
	

}
