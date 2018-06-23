package algorithms;

import java.util.Arrays;

public class HeapSort {
	
	private static int N;
	public static void main(String[] args) {
		int[] arr = {6,42,7,1,89,3,7457,23456,45,23,1156,96,5,125,345};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		heapify(arr);
		for (int i = N; i > 0; i--) {
			swap(arr, 0 , i);
			N = N - 1;
			downHeap(arr, 0);
			
		}
	}
	
	public static void heapify(int[] arr) {
		N = arr.length - 1;
		for (int i = N/2 ; i >= 0; i--) {
			downHeap(arr, i);
		}
	}
	
	public static void downHeap(int[] arr, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int max = i;
		
		if (left <= N && (arr[left] > arr[max])) {
			max = left;
		}
		
		if (right <= N && (arr[right] > arr[max])) {
			max = right;
		}
		
		if (max != i) {
			swap(arr, i , max);
			downHeap(arr, max);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
