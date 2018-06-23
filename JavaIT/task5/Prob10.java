package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scan.nextInt();
		String numInBin = Integer.toBinaryString(number);
		int[] binNumber = new int[numInBin.length()];
		for (int i = 0; i < binNumber.length; i++) {
			binNumber[i] = Character.getNumericValue(numInBin.charAt(i));
		}
		
		System.out.println(Arrays.toString(binNumber));
	}

}
