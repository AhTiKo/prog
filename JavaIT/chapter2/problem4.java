package chapter2;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		System.out.print("Enter b: ");
		double b = sc.nextDouble();
		System.out.print("Enter c: ");
		double c = sc.nextDouble();
		boolean isTrue = false;
		if (((a+b)>c) && ((a+c)>b) && ((c+b)>a)) {
			isTrue = true;
		}
		System.out.println(isTrue);

	}

}
