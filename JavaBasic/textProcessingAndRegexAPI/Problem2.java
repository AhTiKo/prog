package textProcessingAndRegexAPI;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
	
		String findStr = input.nextLine();
		int counter = 0;
		int index = text.indexOf(findStr);
		while(index != -1){
			counter += 1;
			index = text.indexOf(findStr,index+1);
		}
		System.out.println(counter);
	}

}
