package task9;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr +=(char)((int)str.charAt(i) + 5);
		}
		
		System.out.println(newStr);

	}

}
