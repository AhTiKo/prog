package task8;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scan.nextInt();
		
		reverseNum(n);
	}
	
	static void reverseNum (int num) {
		if (num / 10 == 0) {
			System.out.print(num % 10);
			return;
		}
		
		System.out.print(num % 10);
		reverseNum(num / 10);
		return;
	}

}
