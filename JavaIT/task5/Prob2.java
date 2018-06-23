package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = scan.nextInt();
		System.out.println("Enter array's elements: ");
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
			
		}
		boolean isMirror = true;
		
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] != arr[arr.length - 1 - i]) {
				isMirror = false;
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(isMirror);
	}

}
