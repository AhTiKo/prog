package task1;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = scan.nextInt();
		System.out.println("Enter y: ");
		int y = scan.nextInt();
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
