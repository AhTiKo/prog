package task10;

import java.util.Arrays;
import java.util.Scanner;

public class Prob10 {
	private static int n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array :");
		String inputLine = scan.nextLine();
		String[] elements = inputLine.split(" ");
		int[] arr = new int[elements.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(elements[i]);
		}
		
		heapify(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(createSorted(arr)));
	}
	
	static void heapify(int[] arr){
		n = arr.length - 1;
		for (int i = n / 2; i >= 0; i--) {
			downHeap(arr, i);
		}
	}
	
	static void downHeap(int[] arr, int i) {
		
		int leftChild = 2 * i + 1; 
		int rightChild = 2 * i + 2;
		int maxElement = i;
		
		if((leftChild <= n) && (arr[leftChild] > arr[maxElement])) {
			maxElement = leftChild;
		}
		if((rightChild <= n) && (arr[rightChild] > arr[maxElement])) {
			maxElement = rightChild;
		}
		if (maxElement != i) {
			swap(arr, i , maxElement);
			downHeap(arr, maxElement);
		}
	}
	
	static void swap(int[] arr, int x, int y) {
		
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;	
	}
	
	static int[] createSorted(int[]arr) {
		int[] arrSort = new int[arr.length];
		int count = 0;
		heapify(arr);
		for (int i = n; i >= 0; i--) {
			arrSort[arr.length - 1 - count] = arr[0];
			count ++;
			swap(arr, 0, i);
			n --;
			downHeap(arr, 0);
		}
		
		return arrSort;
	}

}
