package task4;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = calcFact(num1) + calcFact(num2);
		
		System.out.println(result);
		
	}
	
	public static int calcFact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}
