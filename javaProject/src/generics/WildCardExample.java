package generics;

import java.util.Arrays;

public class WildCardExample {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getCourseName() + " 수강생"+ Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getCourseName()+ "수강생" + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getCourseName() + "수강생" + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정",5);
		Person p= new Person("일반인");
		personCourse.add(p);
		Person w = new Worker("직장인");
		personCourse.add(w);
		Person s= new Student("학생");
		personCourse.add(s);
		Person h= new HighStudent("고등학생");
		personCourse.add(h);
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));

		Course<HighStudent> highstudentCourse = new Course<HighStudent>("고등학생과정", 5);
		studentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highstudentCourse);
		System.out.println();
		
		registerCourse(personCourse);
		registerCourse(highstudentCourse);
		System.out.println();
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		
	}

}
