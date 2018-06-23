package hwk01;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a1: ");
		int a1 = scan.nextInt();
		System.out.print("Input a2: ");
		int a2 = scan.nextInt();
		System.out.print("Input a3: ");
		int a3 = scan.nextInt();
		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
	}

}
