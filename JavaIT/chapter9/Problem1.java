package chapter9;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String word1 = scan.nextLine();
		System.out.print("Enter second word: ");
		String word2 = scan.nextLine();
		String newWord = "";
		if (word1.length() < word2.length()) {
			newWord = word1.substring(0,5) + word2.substring(6);
		} else {
			newWord = word2.substring(0,5) + word1.substring(6);
		}
		
		System.out.println(newWord.length() + "  " + newWord);
	}

}
