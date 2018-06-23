package task7;

import java.util.Arrays;

public class Prob5 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = {9,8,7,6,5,4,3,2,1};
		System.out.println(Arrays.toString(createMultyArr(arr1,arr2)));
	}
	
	static int[] createMultyArr(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr1[i] * arr2[i];
		}
		
		return arr;
	}
	

}
