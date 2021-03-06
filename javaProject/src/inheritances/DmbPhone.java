package inheritances;

public class DmbPhone extends CellPhone {
	int channel;
	
	void turnOnDmb() {
		System.out.println("채널:" + channel + "방송을 수신합니다.");
		
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "로 변경합니다.");
		
	}
	void turnOffDmb() {
		System.out.println();
	}
	@Override
	void powerOn() {
		System.out.println("DmbPhone 전원을 켭니다.");
	}
	@Override
	void powerOff() {
		System.out.println("DmbPhone 전월을 끕니다.");
	}
	@Override
	void bell() {
		System.out.println("DmbPhone 벨이 울립니다.");
	}
	@Override
	public String toString() {
		return "DmbPhone ==> model : "+  model + ", color : " + color + ", channel : " + channel;
				}
	
}
