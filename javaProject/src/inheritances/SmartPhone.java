package inheritances;

public class SmartPhone extends DmbPhone {
	@Override
	public String toString() {
		return "SmartPhone ==> model : "+  model + ", color : " + color + ", channel : " + channel;
				}
	@Override
	void powerOn() {
		System.out.println("SmartPhone 전원을 켭니다.");
	}
	@Override
	void powerOff() {
		System.out.println("SmartPhone 전월을 끕니다.");
	}
}
