package task9;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str1 = scan.nextLine();
		System.out.println("Enter string : ");
		String str2 = scan.nextLine();
		boolean isEquals = true;
		for (int i = 0; i < str1.length(); i++) {
			int count = 0;
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					count ++;
				}
			}
			
			if (count == 0) {
				System.out.println ( str1.charAt(i) + " не се среща");
			}
			
		}
		
		if (isEquals && str1.length() == str2.length()) {
			System.out.println("еднакви са!");
		}

	}

}
