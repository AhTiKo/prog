package task10;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array :");
		String inputLine = scan.nextLine();
		String[] elements = inputLine.split(" ");
		int[] arr = new int[elements.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(elements[i]);
		}
		boolean isHill;
		if(arr[0] < arr[1]) {
			isHill = true;
		} else {
			isHill = false;
		}
		System.out.println(binarySearch(arr, 0, arr.length - 1, isHill));
	}
	
	static int binarySearch(int[] arr, int left, int right, boolean isHill) {
		int mid = (right + left) / 2;
		if ((isHill && (arr[mid] > arr[mid - 1]) && (arr[mid] > arr[mid + 1])) || 
				(!isHill && (arr[mid] < arr[mid - 1]) && (arr[mid] < arr[mid + 1]))) {
			return arr[mid];
		} 
		
		if (isHill) {
			if(arr[mid] < arr[mid+1]){
				return binarySearch(arr, mid + 1, right, isHill);
			} else {
				return binarySearch(arr, left, mid -1, isHill);
			}
		} else {
			if(arr[mid] > arr[mid+1]){
				return binarySearch(arr, mid + 1, right, isHill);
			} else {
				return binarySearch(arr, left, mid -1, isHill);
			}
		}
		
	}

}
