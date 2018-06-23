package task4;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if (n > m) {
			for (int i = m; i <= n; i++) {
				System.out.print(i + ", ");
			}
		} else {
			for (int i = n; i <= m; i++) {
				System.out.print(i + ", ");
			}
		}

	}

}
