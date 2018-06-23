package task3;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3-digits numbers : ");
		int num = scan.nextInt();
		int units = num % 10;
		int tens = (num / 10) % 10;
		int hundreds = num / 100;
		
		System.out.println((num % units == 0) && (num % tens == 0) && (num % hundreds == 0));
	}

}
