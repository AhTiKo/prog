package task9;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		boolean isPalindrom = true;
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPalindrom = false;
				break;
			}
		}
		
		System.out.println("Is palindrom ? - " + isPalindrom);
	}

}
