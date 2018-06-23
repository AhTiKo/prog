package task7;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = scan.nextInt();
		System.out.println("Enter b: ");
		int b = scan.nextInt();
		System.out.println("Enter c: ");
		int c = scan.nextInt();
		
		System.out.println(mayTriangle(a, b, c));
	}
	
	static boolean mayTriangle (int a, int b, int c) {
		boolean isTriangle = false;
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			isTriangle = true;
		}
		
		return isTriangle;
	}

}
