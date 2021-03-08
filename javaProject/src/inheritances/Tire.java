package inheritances;

public class Tire {
	int maxRotation;// 최대회전수
	int accumlatedRatation; // 누전회전수
	String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;

	}

	public boolean roll() {
		accumlatedRatation++;
		if (accumlatedRatation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumlatedRatation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
}
