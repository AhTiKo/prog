package chapter9;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first sting: ");
		String str1 = scan.nextLine();
		System.out.print("Enter second string: ");
		String str2 = scan.nextLine();
		int str1Pos = 0;
		int str2Pos = 0;
		boolean isHave = false;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if((str1.charAt(i) == str2.charAt(j)) && !isHave) {
					isHave = true;
					str1Pos = i;
					str2Pos = j;
				}
			}	
		}
		
		if (isHave) {
			for (int i = 0; i < str2.length(); i ++) {
				if (i != str2Pos){
					for (int j = 0; j < str1.length(); j++) {
						if (j != str1Pos) {
							System.out.print(" ");
						} else {
							System.out.print(str2.charAt(i));
						}
					}
					System.out.println();
				} else {
					System.out.println(str1);
				}
			}
		} else {
			System.out.println("Няма общ знак");
		}

	}

}
