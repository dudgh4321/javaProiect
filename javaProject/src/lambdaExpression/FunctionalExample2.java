package lambdaExpression;

@FunctionalInterface
interface MyFunctionInterface {
	void run(String str);
}

public class FunctionalExample2 {
	MyFunctionInterface mfi =(str) -> System.out.println(str + "을 실행합니다.");
	mfi.run("run()");
	mfi.run("call()");
}
		
}