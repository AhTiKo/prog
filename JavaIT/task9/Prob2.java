package task9;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		String[] words = str.toLowerCase().split("[ .,]+");
		String strUpper = "";
		for (String string : words) {
			string = string.substring(0,1).toUpperCase() + string.substring(1,string.length());
			strUpper += string + " ";
		}
		
		System.out.println(strUpper);
	}

}
