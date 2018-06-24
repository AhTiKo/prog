package javaSyntax;

import java.util.Scanner;

public class Problem5 {
	
	public static String dexTo7(int num){
		String result = "";
		while (num != 0){
			result = (num%7) + result;
			num /= 7;
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		System.out.print (dexTo7(num));

	}

}
