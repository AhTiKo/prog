package collections;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String inputText = input.nextLine();
		String[] words = inputText.split("[^\\w]+");
		System.out.println(words.length);
		for (String word : words) {
			System.out.println(word);
			
		}

	}

}
