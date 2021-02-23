package bankSystem;

public class Account {

	public static int accIndex = 0;
	private String accNum = null;
	private String name = null;
	int totalMoney = 0;
	
	
	public Account(String name, String accNum, int totalMoney) {
		
		this.name = name;
		this.accNum = accNum;
		this.totalMoney = totalMoney;
	}
	
	
	
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	public void printTotalMoney() {
		System.out.println(this.totalMoney);
	}
	
	
	
}
