package task8;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scan.nextInt();
		System.out.println(isPrimeNumber(n, 2));
		
	}
	
	static boolean isPrimeNumber(int n, int dev) {
		if (dev >= Math.sqrt(n)) {
			return true;
		}
		
		return ((n % dev != 0) && isPrimeNumber(n, dev + 1));
		
		
	}
}
