package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = scan.nextInt();
		System.out.println("Enter array's elements: ");
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
		}
		
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			if((i == 0) || (i == (arr.length -1))) {
				arr2[i] = arr[i];
			} else {
				arr2[i] = (arr[i - 1] + arr[i + 1]);
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}

}
