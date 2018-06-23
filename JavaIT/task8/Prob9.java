package task8;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = scan.nextInt();
		System.out.println("Enter y: ");
		int y = scan.nextInt();
		
		System.out.println(x + " * " + y + " = " + calcMultiplication(x, y));
	}
	
	static int calcMultiplication(int x, int y) {
		if (y == 1) {
			return x;
		}
		
		return x + calcMultiplication(x, y - 1);
	}

}
