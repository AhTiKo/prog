package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length: ");
		int len = scan.nextInt();
		System.out.println("Enter array's elements: ");
		double arr[] = new double[len];
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextDouble();
		}
		double maxAbsElem = 0;
		for (int i = 0; i < 3; i++) {
			double currentMaxElem = 0;
			for (int j = 0; j < arr.length; j++) {
				if(i != 0) {
					if ((Math.abs(currentMaxElem) < Math.abs(arr[j])) && (Math.abs(arr[j]) < Math.abs(maxAbsElem))) {
						currentMaxElem = arr[j];
					}
				} else {
					if (Math.abs(currentMaxElem) < Math.abs(arr[j])) {
						currentMaxElem = arr[j];
					}
				}
				
			}
			System.out.println(currentMaxElem);
			maxAbsElem = currentMaxElem;
		}
		
		System.out.println();

	}

}
