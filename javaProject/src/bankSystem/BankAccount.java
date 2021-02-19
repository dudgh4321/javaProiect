package bankSystem;

public class BankAccount {
  
	static int Index = 0;
   private String name;
   private String accNum;
   int blance;
     
  
   
   
   public BankAccount(String name, String accNum,int blance) {
	   this.name = name;
	   this.accNum = accNum;
	   this.blance = 0;
   }
   
   
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccNum() {
		return accNum;
	}
	
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public int getBlance() {
		return blance;
	}

	public void setBlance(int blance) {
		this.blance = blance;
	}
	   
   

}