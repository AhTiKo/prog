package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = scan.nextInt();
		System.out.println("Enter array's elements: ");
		int arr[] = new int[len];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		int avr = sum / len;
		int minDif = Math.abs(avr - arr[0]);
		int minDifElement = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if ( minDif > Math.abs(avr - arr[i])) {
				minDif = Math.abs(avr - arr[i]);
				minDifElement = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Average = " + avr);
		System.out.println("The nearest element: " + minDifElement);
		
	}

}
