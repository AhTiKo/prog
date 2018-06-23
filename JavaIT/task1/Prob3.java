package task1;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three-digit number: ");
		int number = scan.nextInt();
		System.out.println("Revers number : " + (number % 10) + ((number / 10) % 10) + (number / 100));
		
	}

}
