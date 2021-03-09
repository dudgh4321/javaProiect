package exceptions;

public class ThrowsExample {

	public static void main(String[] args) {
			try {
				findClass();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
public static void findClass() throws ClassNotFoundException{
	Class cls = Class.forName("java.lang.String2");
}
	
	}

