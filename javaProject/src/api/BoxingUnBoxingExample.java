package api;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		
		Integer obj3 = Integer.valueOf("300");
		
		System.out.println(obj1);
		System.out.println(new Integer("200"));
		System.out.println(Integer.valueOf("300"));
		
		int value1 = obj1.intValue();
//		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
//		System.out.println(value2);
		System.out.println(value3);
	
	}	

}
