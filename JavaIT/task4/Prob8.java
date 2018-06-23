package task4;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = scan.nextInt();
		System.out.println("Enter simbol: ");
		char simbol = scan.next().charAt(0);
		for (int i = 1; i <= a; i++) {
			for (int j = 1 ; j <= a; j++) {
				if ((i == 1) || (i == a)) {
					System.out.print("*");
				} else {
					if ((j == 1) || (j == a)){
						System.out.print("*");
					} else {
						System.out.print(simbol);
					}
				}
			}
			System.out.println();
			
		}

	}

}
