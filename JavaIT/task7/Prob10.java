package task7;

import java.util.Arrays;

public class Prob10 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = {9,8,7,6,5,4,3,2,1};
		
		System.out.println(Arrays.toString(createArr(arr1,arr2)));
	}

	private static int[] createArr(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr.length; i++) {
			if(i < arr1.length) {
				arr[i] = arr1[i];
			} else {
				arr[i] = arr2[i - arr1.length];
			}
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		return arr;
	}

	

}
