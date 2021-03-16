package streams;

public class Member {
	public static final int MALE = 0;
	public static final int FEMALE = 1;

	private String name;
	private int sex;
	private int age;

	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;

	}

	@Override
	public int hashCode() {
		return age + sex + name.hashCode();
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return (name.equals(member.name) //
					&& sex == member.sex //
					&& age == member.age);
		} else {
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

}
