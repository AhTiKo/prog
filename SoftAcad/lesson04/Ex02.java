package lesson04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array lenth: ");
		int len = scan.nextInt();
		int[] arr = new int[len];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter value: ");
			arr[i] = scan.nextInt();
		}
		
		int maxElem = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxElem) {
				maxElem = arr[i];
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(maxElem);
		
		int[] arrRev = new int[arr.length];
		for (int i = 0; i < arrRev.length; i++) {
			arrRev[i] = arr[arr.length - 1 -i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arrRev[i] + " ");
		}
		

		
	}

}
