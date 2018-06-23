package task5;

import java.util.Scanner;

public class Prob8 {

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
		boolean isZigZag = true;
		for (int i = 1; i < arr.length -1; i++) {
			if(i % 2 == 0) {
				if ((arr[i] >= arr[i-1]) || (arr[i] >= arr[i+1])) {
					isZigZag = false;
					break;
				}
			} else {
				if ((arr[i] <= arr[i-1]) || (arr[i] <= arr[i+1])) {
					isZigZag = false;
					break;
				}
			}
		}
		System.out.println(isZigZag);
	}

}
