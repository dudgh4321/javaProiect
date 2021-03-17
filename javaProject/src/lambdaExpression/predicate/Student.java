package lambdaExpression.predicate;

public class Student implements Comparable {
	private String name;
	private String sex;
	private int score;

	public Student(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getSex() {
		return sex;
	}
	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
		Student student = (Student) o;
		return this.name.compareTo(o.get);
		}
	  
	}
}
