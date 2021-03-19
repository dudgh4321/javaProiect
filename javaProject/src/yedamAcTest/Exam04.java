package yedamAcTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam04 {

	public static void main(String[] args) {
		List<Student> list =Arrays.asList(new Student("홍길동", 50, 60),
										  new Student("신용권", 50, 30),
										  new Student("김영호", 90, 80));
		
	
	
				list.stream()
				.flatMapToInt(student -> 
							IntStrema.of(studnet.getMath(),student.getEng()))
						.sum
				};

}
