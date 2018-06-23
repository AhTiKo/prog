package task7;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = scan.nextInt();
		System.out.println("Enter b : ");
		int b = scan.nextInt();
		
		System.out.println(compNumbers(a, b));
		
	}
	
	static String compNumbers(int a, int b) {
		if (a == b) {
			return "a = b";
		} else {
			if (a > b) {
				return "a is bigger";
			} else {
				return "b is bigger";
			}
		}
		
	}

}
