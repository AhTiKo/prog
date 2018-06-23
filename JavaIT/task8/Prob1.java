package task8;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scan.nextInt();
		System.out.println(calcFact(n));
	}
	static int calcFact(int n) {
		if(n == 1) {
			return 1;
		}
		return calcFact(n-1) * n;
	}

}
