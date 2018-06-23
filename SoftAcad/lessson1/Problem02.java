package hwk01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first number a: ");
		int a = scan.nextInt();
		System.out.print("Input second number b: ");
		int b = scan.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
