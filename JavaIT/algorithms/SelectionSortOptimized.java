package algorithms;

import java.util.Arrays;

public class SelectionSortOptimized {

	public static void main(String[] args) {
		int[] arr = {6,4,7,1,89,3,7,2,45,23,11,9,5,1};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		for (int i = 0; i < arr.length/2; i++) {
			int maxIndex = start;
			int minIndex = start;
			for (int j = start; j <= end; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[end];
			arr[end] = temp;
			
			if (minIndex == end) {
				minIndex = maxIndex;
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[start];
			arr[start] = temp;
			
			end--;
			start++;
					
		}
	}
}
