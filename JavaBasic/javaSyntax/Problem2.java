package javaSyntax;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 points coordinates: ");
		int ax = input.nextInt();
		int ay = input.nextInt();
		int bx = input.nextInt();
		int by = input.nextInt();
		int cx = input.nextInt();
		int cy = input.nextInt();
		
		int area = Math.abs((ax * ( by - cy ) + bx * ( cy - ay ) + cx * ( ay - by ))/2);
		
		System.out.println(area);
		
			
	}
}

