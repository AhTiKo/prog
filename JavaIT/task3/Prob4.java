package task3;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3-digits number : ");
		int num = scan.nextInt();
		int units = num % 10;
		int tens = (num / 10) % 10;
		int hundreds = num / 100;
		
		if ((units == tens) && (tens == hundreds)) {
			System.out.println("digits are quals");
		} else {
			if ((units > tens) && (tens > hundreds)) {
				System.out.println("digits are in ascending order");
			} else {
				if ((units < tens) && (tens < hundreds)) {
					System.out.println("digits are in descending order");
				} else {
					System.out.println("digits are not ordered");
				}
			}
		}

	}

}
