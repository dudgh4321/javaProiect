package object2;

public class Member1 {
	private String name;
	private String id;
	private String pw;
	private int age;
	
	public Member1(String name, String id, String pw, int age) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	public Member1(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public boolean login(String id,String pw) {
		  boolean result = false;
		if(id == "hong" && pw == "12345") {
			 result = true;
		}else {
			 result = false;
		}	
			return result;
	}
	
	public void logout(String id) {
		if(id == "hong") {
			System.out.println("로그아웃 되었습니다.");
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
