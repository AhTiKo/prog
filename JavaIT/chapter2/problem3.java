package chapter2;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		double a = sc.nextDouble();
		System.out.print("Enter b : ");
		double b = sc.nextDouble();
		double s = a*b;
		System.out.printf("S = %.02f", s);

	}

}
