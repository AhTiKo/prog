package hwk02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете a: ");
		float a = scan.nextFloat();
		System.out.println("Въведете b: ");
		float b = scan.nextFloat();
		if (a <  b) {
			System.out.println(a + " ; " +b);
		} else {
			System.out.println(b + " ; " + a);
		}
	}

}
