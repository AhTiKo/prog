package task9;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter first string : ");
			String str1 = scan.nextLine();
			System.out.println("Enter second string : ");
			String str2 = scan.nextLine();
			
			System.out.println(str1.toUpperCase() + "  " + str1.toLowerCase());
			System.out.println(str2.toUpperCase() + "  " + str2.toLowerCase());

	}

}
