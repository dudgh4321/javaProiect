package inheritances;

public class Friend {
	public static int friendIndex = 0;
	String name;
	String phone;
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	
	
}
