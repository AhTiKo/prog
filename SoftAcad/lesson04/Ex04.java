package lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

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
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[arr.length + 1];
		arr2[0] = arr.length;
		for (int i = 1; i < arr2.length; i++) {
			arr2[i] = arr[i-1] * i;
		}
	
		
		System.out.println(Arrays.toString(arr2));
	}

}
