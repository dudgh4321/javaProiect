package generics;

public class Util {
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); //doubleValue라는 메소드는 Number 타입의 형태만 사용가능
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}

