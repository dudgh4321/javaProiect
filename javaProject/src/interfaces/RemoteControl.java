package interfaces;

public interface RemoteControl {
	static final int MAX_VOLUME =10;
	int MIN_VOLUME = 0;
	
	void turnOn();// 추상메소드 (구현부분 없음)
	void turnOff();
	void setVolume(int volume); 
}
