package task7;

public class Prob1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(calcAvr(arr));
	}
	
	static int calcAvr(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (sum / arr.length);
	}

}
