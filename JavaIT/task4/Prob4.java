package task4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		for (int i = 1; i < 1000; i++) {
			if (i % num == 0) {
				System.out.println(i);
			}
		}

	}

}
