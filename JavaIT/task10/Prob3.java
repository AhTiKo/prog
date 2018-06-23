package task10;

import java.util.Arrays;
import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("array's lenth? ");
		int len = scan.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements: ");
		for (int i = 0; i < len ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter K: ");
		int k = scan.nextInt();
		quickSort(arr, 0, len - 1);
//		System.out.println(Arrays.toString(arr));
		System.out.println("K-th biggest elemet is " + arr[len - k]);
	}
	
	static void quickSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}
		
		int k = partition(arr, left, right);
		quickSort(arr, left, k - 1);
		quickSort(arr, k + 1, right);
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int k = left - 1;
		for (int i = left; i <= right; i++) {
			if (arr[i] <= pivot) {
				k ++;
				swap(arr, k, i);
			}
		}
		return k;
	}

}
