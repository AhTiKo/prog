package task10;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lenth :");
		int len = scan.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements: ");
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
		}
		boolean isSorted = true;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}
		
		if (!isSorted) {
			System.out.println("Array isn't sorted!");
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] > arr[i + 1]) {
					System.out.println(arr[i] + " > " + arr[i + 1]);
				}
			}
		} else {
			System.out.println("Array is sorted!");
		}
	}

}
