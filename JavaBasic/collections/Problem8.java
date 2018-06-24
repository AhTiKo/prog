package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		inputLine = inputLine.toLowerCase();
		String[] words = inputLine.split("[^\\w]+");
		ArrayList<String> strList = new ArrayList<>();
		
		Arrays.sort(words);
		
		for (int i = 0; i < words.length; i++){
			if(!strList.contains(words[i])){
				strList.add(words[i]);
			}
		}
		
		for (String string : strList) {
			System.out.print(string + " ");
		}
		
	
	}

}
