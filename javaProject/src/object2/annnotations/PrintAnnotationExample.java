package object2.annnotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] methods = Service.class.getDeclaredMethods();
		Constructor[] constructs = Service.class.getDeclaredConstructors();
		Field[] fields = Service.class.getDeclaredFields();
	}

}
