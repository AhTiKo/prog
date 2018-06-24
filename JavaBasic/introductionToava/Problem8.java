package introductionToava;

import java.util.Scanner;

public class Problem8 {
	
	private static float findAverage (float a, float b, float c) {
		return (a+b+c)/3;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		float a = input.nextFloat();
		System.out.print("Enter second number: ");
		float b = input.nextFloat();
		System.out.print("Enter 3th number: ");
		float c = input.nextFloat();
		input.close();
		
		System.out.printf("Average is : %.2f %n",findAverage(a,b,c));
	}
	
	
}
	


