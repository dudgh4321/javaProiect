package inheritances;

public class ComFriend extends Friend{
	public static int friendIndex = 0;
	String name;
	String phone;
	String department;

	public ComFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}

	@Override
	public String toString() {
		return "ComFriend [department=" + department + ", name=" + name + ", phone=" + phone + "]";
	}
	 
}
