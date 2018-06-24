package textProcessingAndRegexAPI;

import java.util.HashMap;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word1 = input.next().trim();
		String word2 = input.next().trim();
			
		
		System.out.println(exchangeable(word1,word2));
		
		
	}

	private static boolean exchangeable(String word1, String word2) {
		HashMap<Character,Character> map = new HashMap<>();
		boolean isTrue = false;
		if (word1.length() == word2.length()){ 
			for (int i = 0; i < word1.length(); i++) {
				if (map.containsKey(word1.charAt(i))){
					if (map.get(word1.charAt(i)) == word2.charAt(i)){
						isTrue = true;
					}else return false;	
				}else {
					map.put(word1.charAt(i),word2.charAt(i));
				}
			}
		}
		return isTrue;
	}

}