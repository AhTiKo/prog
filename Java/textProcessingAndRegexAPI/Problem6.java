package textProcessingAndRegexAPI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-zA-Z]*[A-Z]{1}[^a-z1-9-A-Z]*");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()){
			System.out.print(matcher.group()+" ");
		}

	}

}
