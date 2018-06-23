package algorithms;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] arr = createArr(100);
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static int[] createArr(int len) {
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*1001);
		}
		return arr;
	}

}
