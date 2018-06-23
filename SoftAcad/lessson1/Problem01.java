package hwk01;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = scan.nextInt();
		System.out.print("Input second number: ");
		int b = scan.nextInt();
		int sum = a + b;
		int diff = a - b;
		int mult = a * b;
		int div = a / b;
		int res = a % b;
		System.out.println("a + b = " + sum);
		System.out.println("a - b = " + diff);
		System.out.println("a * b = " + mult);
		System.out.println("a / b = " + div);
		System.out.println("a % b = " + res);
		System.out.println();
		System.out.print("Input first double: ");
		double x = scan.nextDouble();
		System.out.print("Input second double: ");
		double y = scan.nextDouble();
		double sumD = x + y;
		double diffD = x - y;
		double multD = x * y;
		double divD = x / y;
		System.out.println("x + y = " + sumD);
		System.out.println("x - y = " + diffD);
		System.out.println("x * y = " + multD);
		System.out.println("x / y = " + divD);
		
	}

}
