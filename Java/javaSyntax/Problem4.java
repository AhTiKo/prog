package javaSyntax;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		double a = input.nextFloat();
		double b = input.nextFloat();
		double c = input.nextFloat();
		input.close();

		double f1 = Math.pow((a*a + b*b)/(a*a - b*b),(a+b+c)/Math.sqrt(c));
		double f2 = Math.pow((a*a + b*b-c*c*c),(a-b));
		double diff = Math.abs(((a + b + c)/3)-((f1 + f2)/2));
		System.out.printf("F1 = %.02f ; F2 = %.02f ; Diff = %.02f %n",f1,f2,diff);

	}

}
