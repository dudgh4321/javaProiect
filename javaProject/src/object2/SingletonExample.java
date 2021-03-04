package object2;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Book b1 = new Book("자바","저자","출판사",1000);
		Book b2 = new Book("자바","저자","출판사",1000);

	}

}
