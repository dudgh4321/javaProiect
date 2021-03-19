package yedamAcTest;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class Exam06 {

	public static void main(String[] args) {
		List<Employee> list =Arrays.asList(new Employee(1 ,"홍길동", "2011-02-02", "총무", 1000),
				   new Employee(2 ,"박길동", "2012-02-02", "IT_PROG", 2000),
				   new Employee(3 ,"김길동", "2013-02-02", "IT_PROG", 3000));

		
	OptionalDouble avg = list.stream()
	.filter((t) -> t.getDepatment().equals("IT_PROG"))
	.mapToInt(Employee :: getSalary)
	.average();
	avg.orElse(0);
	System.out.println(avg.orElse(0));
	}
}
		
