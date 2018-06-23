package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter even array: ");
		String line = scan.nextLine();
		String[] elements = line.split(" ");
		int[] arr = new int[elements.length];
		for (int i = 0; i < elements.length; i++) {
			arr[i] = Integer.parseInt(elements[i]);
		}
		int[] newArray = new int[arr.length];
		for (int i = 0; i < (arr.length / 2); i++) {
			newArray[i] = arr[i];
			newArray[arr.length / 2 + i] = arr[arr.length - 1 - i];
		}
			
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArray));
	}

}
