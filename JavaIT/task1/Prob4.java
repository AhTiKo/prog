package task1;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = scan.nextInt();
		System.out.println("Enter y: ");
		int y = scan.nextInt();
		
		System.out.println("Before");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("After");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
