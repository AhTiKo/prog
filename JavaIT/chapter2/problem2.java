package chapter2;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter r: ");
		double r = sc.nextDouble();
		double s = Math.PI*r*r;
		System.out.printf("S = %.2f", s);

	}

}
