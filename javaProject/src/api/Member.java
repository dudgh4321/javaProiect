package api;

public class Member implements Cloneable {
	String id;
	String name;
	String password;
	int age;
	boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();

		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}

}
