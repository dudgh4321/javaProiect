package api;

import variables.GetAverageValue;

public class MemberExample1 {

	public static void main(String[] args) {
		
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("복제객체의 필드값");
		System.out.println("id: "+ cloned.id);
		System.out.println("name: "+ cloned.name);
		System.out.println("password: "+ cloned.password);
		
		
		
		
		
		
		
		
		
		
	}

}
