package textProcessingAndRegexAPI;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		Pattern pattern = Pattern.compile("[\\w_.+-]+@[\\w]+.[a-z]{0,2}\\.[a-z]{1,3}");
		Matcher matcher = pattern.matcher(inputLine);
		if (matcher.find()){
			System.out.println(matcher.group());
		}
	}

}
