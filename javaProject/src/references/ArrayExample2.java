package references;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] arrays = new int[10];
		int count = 0;
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			arrays[i] = (int) (Math.random() * 100) + 1;
			if (arrays[i] % 2 == 0) {
				sum = sum + arrays[i];
				count++;
			}
		} double avg = (double) sum / count;
		System.out.println("10개의 배열 중 짝수의 평균 : " + avg);
	}
}
