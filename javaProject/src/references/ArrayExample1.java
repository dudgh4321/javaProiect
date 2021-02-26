package references;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] arrays = new int[5];
		int maxValue = 0;

		for (int i = 0; i < 5; i++) {
			arrays[i] = (int) (Math.random() * 10) + 1;
			if (arrays[i] > maxValue) {
				maxValue = arrays[i];
			}
		}
		System.out.println("최대값 : " + maxValue);
	}
}

/*		System.out.println(arrays[0]);
		System.out.println(arrays[1]);
		System.out.println(arrays[2]);
		System.out.println(arrays[3]);
		System.out.println(arrays[4]); 			*/
 
