package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class problem10 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String inputLines = input.nextLine();
			String[] inputCards = inputLines.split("[^\\w]+"); 
			HashMap<String, Integer> cards = new HashMap<String, Integer>();
			System.out.println(Arrays.toString(inputCards));
			for (int i = 0; i < inputCards.length; i++) {
				if (!cards.containsKey(inputCards[i])){
					cards.put(inputCards[i], 1);
				}else{
					cards.put(inputCards[i], cards.get(inputCards[i]) + 1);
				}
			}
			for(Map.Entry<String, Integer>cardEntry: cards.entrySet()){
				int a = cardEntry.getValue();
				int n = inputCards.length;
				double result = ((double)a/(double)n)*100;
				float precents = (cardEntry.getValue()/inputCards.length);
				System.out.printf("%s -> %.2f %% %n",cardEntry.getKey(),result);
			}
	}

}
