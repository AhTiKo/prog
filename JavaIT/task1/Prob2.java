package task1;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a1 number: ");
		int a1 = scan.nextInt();
		System.out.print("Enter a2 number: ");
		int a2 = scan.nextInt();
		System.out.print("Enter a3 number: ");
		int a3 = scan.nextInt();
		int temp = a1;
		a1=a2;
		a2=a3;
		a3=temp;
		
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
	}

}
