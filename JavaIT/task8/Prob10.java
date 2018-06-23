package task8;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = scan.nextInt();
		System.out.println("Enter y: ");
		int y = scan.nextInt();
		System.out.println(calcPow(x, y));
	} 
	static int calcPow(int x, int y){
		if (y == 0) {
			return 1;
		}
		if (y == 1) {
			return x;
		}
		
		return  calcMultiplication(calcPow(x, y - 1), x);
	}
	
	static int calcMultiplication(int x, int y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		if (y == 1) {
			return x;
		}
		
		return x + calcMultiplication(x, y - 1);
	}
}
