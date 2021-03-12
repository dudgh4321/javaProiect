package test;

public class BB {

	public static void main(String[] args) {
	int[] intAry = {4,8,3,1,10,5,2};
	for(int j=0; j<(intAry.length); j++) {
	for(int i=0; i<(intAry.length-1); i++) {
		if(intAry[i]>intAry[i+1]) {
			int a = intAry[i+1];
			intAry[i+1] = intAry[i];
			intAry[i] = a;
		}
	}
	}System.out.println("{"+intAry[0]+ ","+ intAry[1] +","+ intAry[2]+","+ intAry[2]+","+ intAry[3]+","+ intAry[4]+","+ intAry[5]+","+ intAry[6]+"}");
	
	
	
	}

}
