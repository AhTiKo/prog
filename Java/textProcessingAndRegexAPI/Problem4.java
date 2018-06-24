package textProcessingAndRegexAPI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		String regex ="\\w+";
		Pattern pattern = Pattern.compile(regex);
		int counter = 0;
					
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()){
			counter += 1;
			
		}
		System.out.println(counter);
		
			

				

	}

}
