package task5;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = scan.nextInt();
		System.out.println("Enter array's elements: ");
		int arr[] = new int[len];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 5 == 0) && (arr[i] > 5)) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
