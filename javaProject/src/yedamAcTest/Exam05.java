package yedamAcTest;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exam05 {

	public static void main(String[] args) {
		List<Employee> list =Arrays.asList(new Employee(1 ,"홍길동", "2011-02-02", "총무", 1000),
										   new Employee(2 ,"박길동", "2012-02-02", "인사", 2000),
										   new Employee(3 ,"김길동", "2013-02-02", "총무", 3000));
		
		
		OptionalDouble avg = list.stream()
		.mapToInt(Employee :: getSalary)
		.average();
		
		System.out.println("전체사원의 급여평균: "+ avg);
		
	
		
	}

}
