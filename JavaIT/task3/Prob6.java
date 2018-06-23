package task3;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 4-digits number: ");
			int num = scan.nextInt();
			boolean isFindZero = false;
			String numStr = Integer.toString(num);
			for (int i = 0; i < numStr.length(); i++) {
				if(numStr.charAt(i) == '0') {
					isFindZero = true;
				}
			}
			
			if (isFindZero) {
				System.out.println("The number contains zero! ");
			} else {
				System.out.println("The number not contains zero! ");
			}
	}

}
