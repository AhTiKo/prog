package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		inputLine = inputLine.toLowerCase();
		String[] words = inputLine.split("[^\\w]+");
	//	Arrays.sort(words);
		TreeMap<String,Integer> counter = new TreeMap<>();
	//	String bestStr = words[0];
	//	int bestCount = 1;
		int count = 0;
	//	for (int i = 0; i < words.length; i++){
	//		count = 1;
	//		for ( int j = i+1; j < words.length; j++){		
	//			if (words[i].equals(words[j])){
	//				count +=1;
	//				if (count > bestCount){
	//					bestCount = count;
	//					bestStr = words[i];				
	//			}
	//		}
	//	}	
	//	System.out.printf("%s -> %d %n",bestStr,bestCount);
		
		for (int i = 0; i < words.length; i ++ ){
			if(counter.containsKey(words[i])){
				count = counter.get(words[i])+1;
				counter.put(words[i],count);
			}else{
				counter.put(words[i], 1);
			}
		}
		
		for(Map.Entry<String,Integer> wordEntry: counter.entrySet()){
			if(count == wordEntry.getValue()){
				System.out.printf("%s -> %d times %n",wordEntry.getKey(),wordEntry.getValue());
			}
		}
		
	}

}
