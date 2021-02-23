package operators;

public class Exercuse07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		
		System.out.println( (x>7) && (y<=5) );
		System.out.println( (x%3 ==2) || (y%2 !=1));
		
		boolean z = (x++ % 2 ==0) || (y++ %3 ==0);
		if(z) {	
		System.out.println("true : " + x + ", y: " + y);
		}
		else {
		System.out.println("false : " + x + ", y: " + y);
	
		}
		
		// boolean z=	(x++ % 2 ==0) | (y++ %3 ==0) ;
		// System.out.println("true : " + x + ", y: " + y);
		// 이땐 x 11 y 6나옴 
		
		
		

		
	}

}
