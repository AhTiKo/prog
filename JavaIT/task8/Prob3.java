package task8;

public class Prob3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(isGrowing(arr, 0));
	}
	
	static boolean isGrowing(int[]arr, int index) {
		if (index == arr.length -1) {
			return true;
		}
		
		if((arr[index] < arr[index + 1]) && (isGrowing(arr,index + 1))) {
			return true;
		} else {
			return false;
		}
	}

}
