package task4;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		boolean isPalindrom = true;
		String numStr = Integer.toString(num);
		for (int i = 0; i <= numStr.length()/2; i ++) {
			if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) {
				isPalindrom = false;
			}
		}
		
		System.out.println(isPalindrom);

	}

}
