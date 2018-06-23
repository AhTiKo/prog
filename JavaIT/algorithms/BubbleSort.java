package algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {6,4,7,1,89,3,7,2,45,23,11,9,5,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean hasSwap = false;
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					hasSwap = true;
				}
			}
			
			if (!hasSwap) {
				break;
			}
		}
	}

}
