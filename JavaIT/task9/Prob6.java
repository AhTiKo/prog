package task9;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		System.out.println("Enter char :");
		char ch = scan.next().charAt(0);
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count ++;
			}
		}
		
		System.out.printf("Символа се среща %d пъти %n", count);

	}

}
