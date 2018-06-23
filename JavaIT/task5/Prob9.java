package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		
		int[] arr1 = inputArr();
		int[] arr2 = inputArr();
		
		if (arr1.length > arr2.length) {
			System.out.println(Arrays.toString(createArr(arr1, arr2)));
		} else {
			System.out.println(Arrays.toString(createArr(arr2, arr1)));
		}
		

	}
	
	static int[] inputArr(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array: ");
		String line = scan.nextLine();
		String [] elements = line.split(" ");
		int[] arr = new int[elements.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(elements[i]);
		}
		//scan.close();
		return arr;
	}
	
	static int[] createArr(int[]arr1, int[]arr2) {
		int[] arr3 = new int[arr1.length];
		for (int i = 0; i < arr3.length; i++) {
			if (i < arr2.length) {
				if (arr1[i] > arr2[i]) {
					arr3[i] = arr1[i];
				} else {
					arr3[i] = arr2[i];
				}
			} else {
				arr3[i] = arr1[i];
			}
		}
		return arr3;
	}

}
