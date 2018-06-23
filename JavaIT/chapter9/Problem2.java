package chapter9;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first sting: ");
		String str1 = scan.nextLine();
		System.out.print("Enter second string: ");
		String str2 = scan.nextLine();
		boolean equal = false;
		if (str1.length() > str2.length()) {
			System.out.println("������ ��� � �� �����.");
			compareStr(str1,str2,equal);
		} else {
			if (str2.length() > str1.length()) {
				System.out.println("������ ��� � �� �����.");
				compareStr(str2,str1,equal);
			} else {
				equal = true;
				System.out.println("����� ���� � ����� �������.");
				compareStr(str1,str2,equal);
			}
		}
		
	}
	
	public static void compareStr(String longStr, String shortStr,boolean equal) {
		System.out.println("������� � �������: ");
		boolean isDifr = false;
		for (int i = 0; i < shortStr.length(); i++) {
			if(shortStr.charAt(i) != longStr.charAt(i)){
				isDifr = true;
				System.out.println((i + 1) + "  " + shortStr.charAt(i) + " - " + longStr.charAt(i) );
			}
		}
		
		if ((!isDifr)&&equal){
			System.out.println("����, ���������� �� �������. ");
			
		} else {
			if((!isDifr)&&(!equal)){
				System.out.println("������ ����� �� ������� � ������. ");
			}
		}
	}

}
