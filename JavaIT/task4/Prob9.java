package task4;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= ((2*n)-1); j++) {
				if((j <= (n - i)) || (j >= (n + i))) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
