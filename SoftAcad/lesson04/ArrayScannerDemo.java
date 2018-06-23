package lesson04;

import java.util.Scanner;

public class ArrayScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter value: ");
			arr[i] = scan.nextInt();
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
