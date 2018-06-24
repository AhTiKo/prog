package javaSyntax;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first side: ");
		int a = input.nextInt();
		System.out.print("Enter secont side: ");
		int b = input.nextInt();
		input.close();
		
		System.out.printf("Rectangle area is %d ",(a*b));

	}

}
