package inheritances;

public class CellPhoneEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone cp = new CellPhone();
		cp = new DmbPhone();
		cp = new SmartPhone();

		if (cp instanceof DmbPhone) {
			DmbPhone dp = (DmbPhone) cp;
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
		} else {
			System.out.println("Casting 할 수 없습니다.");
		}
	
		cp= new DmbPhone();
		cp.powerOn();
		
		cp= new SmartPhone();
		cp.powerOn();
	}
}
