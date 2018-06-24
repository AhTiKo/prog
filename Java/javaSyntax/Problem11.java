package javaSyntax;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two strings: ");
		String inputLine = input.nextLine();
		String[] strs = inputLine.split("\\s+");
		
		System.out.println(sumCharCodes(strs[0],strs[1]));

	}
	
	public static int sumCharCodes(String str1, String str2){
		int sum=0;
		int length;
		if (str1.length() >= str2.length()){
			length = str1.length();
		}else{
			length = str2.length();
		}
		for (int i = 0; i < length; i ++){
			if ((str1.length() > i) & (str2.length() > i)){
			sum += (int)str1.charAt(i)*(int)str2.charAt(i);
			}else{
				if (str1.length() <= i){
					sum += (int)str2.charAt(i);
				}else{
					sum += (int)str1.charAt(i);
				}
			}
		}
		
		return sum;
	}

}
