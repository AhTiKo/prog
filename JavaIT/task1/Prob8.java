package task1;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = scan.nextDouble();
		System.out.println("Enter b: ");
		double b = scan.nextDouble();
		System.out.println("Enter c: ");
		double c = scan.nextDouble();
		
		double p = a + b + c;
		double s = (Math.sqrt((a + b + c) * (- a + b + c) * (a - b + c) * (a + b - c)))/4;
		System.out.println("P = " + p);
		System.out.println("S = " + s);

	}

}
