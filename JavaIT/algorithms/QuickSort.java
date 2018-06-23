package algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {6,42,7,1,89,3,7457,23456,45,23,1156,96,5,125,345};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if (left >=right) {
			return;
		}
		int k = partition(arr, left, right);
		quickSort(arr, left, k - 1);
		quickSort(arr, k + 1, right);
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int k = left - 1;
		for (int i = left; i <= right; i ++) {
			if (arr[i] <= pivot) {
				k ++;
				swap(arr, k ,i);
			}
		}
		return k;
	}
	
	public static void swap(int[] arr, int k, int i) {
		int temp = arr[k];
		arr[k] = arr[i];
		arr[i] = temp;
	}

}
