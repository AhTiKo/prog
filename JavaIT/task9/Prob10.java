package task9;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array lenth: ");
		int len = scan.nextInt();
		scan.nextLine();
		String[] arr = new String[len];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter string : ");
			arr[i] = scan.nextLine();
		}
		
		int maxlen = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > maxlen) {
				maxlen = arr[i].length();
			}
		}
		
		for (int i = 1; i <= maxlen + 2; i ++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("*");
			if(arr[i].length() < maxlen) {
				System.out.print(arr[i]);
				for (int j = 0; j < maxlen - arr[i].length(); j++) {
					System.out.print(" ");
				}	
			} else {
				System.out.print(arr[i]);
			}
			System.out.println("*");
		}
		for (int i = 1; i <= maxlen + 2; i ++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
