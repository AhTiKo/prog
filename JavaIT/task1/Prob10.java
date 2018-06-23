package task1;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st boolean: ");
		boolean a = scan.nextBoolean();
		System.out.println("Enter 2nd boolean: ");
		boolean b = scan.nextBoolean();
		System.out.println("Enter 3rd boolean: ");
		boolean c = scan.nextBoolean();
		System.out.println("Enter 4th boolean: ");
		boolean d = scan.nextBoolean();
		System.out.println("Enter 5th boolean: ");
		boolean e = scan.nextBoolean();
		
		boolean all = a && b && c && d && e;
		
		System.out.println("Is all true? : " + all);

	}

}
