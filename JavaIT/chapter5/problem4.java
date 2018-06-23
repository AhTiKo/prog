package chapter5;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		boolean isPrime = true;
		for( int i = 2; i <= Math.sqrt(number); i++) {
			if ( (number % i) == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("Prime!");
		} else {
			System.out.println("no Prime!");
		}
	}

}
