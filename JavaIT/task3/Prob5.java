package task3;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x1 = scan.nextInt();
		System.out.println("Enter y: ");
		int y1 = scan.nextInt();
		System.out.println("Enter x: ");
		int x2 = scan.nextInt();
		System.out.println("Enter y: ");
		int y2 = scan.nextInt();
		
		
		if((((x1 + y1) % 2 == 0) && ((x2 + y2) % 2 == 0)) || (((x1 + y1) % 2 != 0) && ((x2 + y2) % 2 != 0)) ) {
			System.out.println("Both filds [" + x1 + "," + y1 + "] and [" + x2 + "," + y2 + "]  are of the same color!");
		} else {
			System.out.println("Both filds [" + x1 + "," + y1 + "] and [" + x2 + "," + y2 + "]  are of different color!");
		}
		
	}

}
