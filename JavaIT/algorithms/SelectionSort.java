package algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {6,4,7,1,89,3,7,2,45,23,11,9,5,1};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int maxIndex = 0;
			for (int j = 0; j <= arr.length-i; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[arr.length - i];
			arr[arr.length - i] = temp;
					
		}
	}

}
