package task1;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter boolean x: ");
		boolean x = scan.nextBoolean();
		System.out.println("Enter boolean y: ");
		boolean y = scan.nextBoolean();
		
		System.out.println("x = " + x + ";  y = " + y);
		
		System.out.println("x & y = " + (x & y));
		System.out.println("x | y = " + (x | y));
		System.out.println("x ^ y = " + (x ^ y));

	}

}
