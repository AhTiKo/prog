package task5;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = scan.nextInt();
		System.out.println("Enter array's elements: ");
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
		}
		
		int maxIndex = 0;
		int maxLength = 1;
		int curentIndex = 0;
		int curentLength = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[curentIndex] == arr [i]) {
				curentLength ++;
				if (curentLength > maxLength) {
					maxLength = curentLength;
					maxIndex = curentIndex;
				}
			
			} else {
				
				
			
				curentIndex = i;
				curentLength = 1;
			}
			
		}
		for (int i = maxIndex; i < (maxIndex + maxLength); i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
