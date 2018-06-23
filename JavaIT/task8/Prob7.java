package task8;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scan.nextInt();
		System.out.println("Enter M: ");
		int m = scan.nextInt();
		
		printNum(n,m);
	}

	static void printNum(int n, int m) {
		if( m == n) {
			System.out.println(n);
			return;
		}
		printNum(n, m - 1);
		for (int i = n; i <= m; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		return;
		
	}

}
