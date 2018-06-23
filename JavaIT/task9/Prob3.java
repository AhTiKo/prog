package task9;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		
		String[] words = str.split("[ ,.]+");
		int bestLen = 0;
		for(String word: words) {
			if(word.length() > bestLen) {
				bestLen = word.length();
			}
		}
		
		System.out.println(words.length + " думи, най-дългата е с " + bestLen + " символа");
	}

}
