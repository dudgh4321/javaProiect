package inheritances;

public class UnivFriend extends Friend {
	public static int friendIndex = 0;
	String name;
	String phone;
	String major;

	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [major=" + major + ", name=" + name + ", phone=" + phone + "]";
	}

}
