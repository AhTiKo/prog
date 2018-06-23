package task1;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x: ");
		int x = scan.nextInt();
		System.out.println("хилядни = " + (x / 1000));
		System.out.println("стотици = " + ((x / 100) % 10));
		System.out.println("десетици = " + ((x / 10) % 10));
		System.out.println("еденици = " + (x % 10));

	}

}
