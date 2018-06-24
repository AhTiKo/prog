package collections;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputText = input.nextLine();
		String word = input.nextLine();
		String[] wordsInText = inputText.split("[^\\w]+");
		int count = 0;
		for (String element: wordsInText){
			if(word.equalsIgnoreCase(element)){
				count++;
			}
		}
		
		System.out.println(count);

	}

}
