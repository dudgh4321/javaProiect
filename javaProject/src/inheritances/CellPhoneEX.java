package inheritances;

public class CellPhoneEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone cp = new CellPhone();
		cp.model = "Galaxy";
		cp.color = "White";
		cp.powerOn();
		cp.bell();
		cp.powerOff();
		System.out.println("=====================================");
		DmbPhone dp = new DmbPhone();
		dp.model = "Motolora";
		dp.color = "Black";
		dp.powerOn();
		dp.bell();
		dp.powerOff();
		dp.hangUp();
		dp.turnOnDmb();
		dp.turnOffDmb();
		System.out.println("=====================================");
		SmartPhone sp = new SmartPhone();
		sp.model = "LGPhone";
		sp.color = "Pink";
		sp.commonMethod();
		System.out.println("=====================================");
		System.out.println(cp.toString());
		System.out.println(dp.toString());
		System.out.println(sp.toString());
		
				
		
	}
	
	

}
