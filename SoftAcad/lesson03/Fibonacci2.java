package lesson03;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		int fibN = 0;
		int fibSum = 1;
		if (n == 0) {
			fibN = 0;
			fibSum = 0;
		} else {
			for (int i = 1; i < n ; i++) {
				fibN = fib1 + fib2;
				fibSum += fibN;
				fib1 = fib2;
				fib2 = fibN;
				
			}
		}
		System.out.println(fibN);
		System.out.println(fibSum);
	}

}
