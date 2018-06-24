package exams;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class exam1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		String[] elements = inputLine.split(" ");
		//System.out.println(Arrays.toString(elements));
		TreeMap<String , Integer> Map = new TreeMap<>(); 
		for (int i = 0; i < elements.length; i++) {
			Map.put (numName(elements[i]), Integer.parseInt(elements[i]));
		}
		for (Map.Entry< String , Integer> elem: Map.entrySet()) {
		System.out.print(elem.getValue() + " ");
		}
	}

	private static String numName(String string) {
		String numName = "";
		String element = "";
		for (int i = 0; i < string.length(); i++) {
			switch (string.charAt(i)){
			case '0' : 
				element = "zero";
				break;
			case '1' : 
				element = "one";
				break;
			case '2' : 
				element = "two";
				break;
			case '3' : 
				element = "three";
				break;
			case '4' : 
				element = "four";
				break;
			case '5' : 
				element = "five";
				break;
			case '6' : 
				element = "six";
				break;
			case '7' : 
				element = "seven";
				break;
			case '8' : 
				element = "eight";
				break;
			case '9' : 
				element = "nine";
				break;
			}
			if (i == 0){
					numName = element;
				}else{
					numName += "-" + element;
				}
	
			
		}
		return numName;
	
	}
}
