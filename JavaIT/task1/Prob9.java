package task1;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scan.nextInt();

		System.out.println("number dev 2 : " + (number % 2 == 0));
	}

}
