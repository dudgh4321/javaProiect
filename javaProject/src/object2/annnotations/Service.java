package object2.annnotations;

public class Service {

	@printAnnotation()
	String name;

	@printAnnotation(value = "*")
	public void method1() {

	}

	@printAnnotation(value = "*", number = 20)
	public void method2() {

	}
	
	@printAnnotation(value= "#", number= 20)
	public void method3() {
		
	}

}
