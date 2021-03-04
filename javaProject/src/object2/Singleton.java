package object2;

public class Singleton {
	private static Singleton singgleton = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
