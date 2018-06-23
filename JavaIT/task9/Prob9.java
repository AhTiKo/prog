package task9;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		int bestCount = 0;
		char bestChar = '0';
		for (char i = 'A'; i <= 'z'; i ++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i == str.charAt(j)) {
					count ++;
					if (count > bestCount) {
						bestCount = count;
						bestChar = i;
					}
				}
			}
			System.out.println( i + " -> " + count);
		}
		if (bestChar != '0') {
			System.out.println("Best char is " + bestChar + " -> " + bestCount);
		}

	}

}
