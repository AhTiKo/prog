package chapter8;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		int[] arr1 = {3,4,5,5};
		int[] arr2 = {2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(sumArr(arr1, arr2)));

	}
	
	public static int[] sumArr(int[]a, int[]b){
		int[] arr = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			arr[i] = a[i];
		}
		for (int i = a.length; i < arr.length; i++) {
			arr[i] = b[i-a.length];
		}
		return arr;
		
	}

}
