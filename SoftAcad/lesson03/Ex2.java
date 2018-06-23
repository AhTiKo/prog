package lesson03;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();
		int a = n;
		boolean isPalindrom = true;
		int counter = 1;
		while ((a / 10) != 0) {
			a /= 10;
			counter ++;
		}
		a = n;
		int firstDev = (int)Math.pow(10,(counter-1));
		
		for (int i = 0; i < counter / 2; i++) {
			if ((a / firstDev) != (a % 10) ) {
				isPalindrom = false;
				break;
			}
			a %= firstDev;
			a /= 10;
			firstDev /= 100;
		}
	
		
//		String n = scan.nextLine();
	
		
		
//		for (int i = 0; i < n.length()/2; i++) {
//			if (n.charAt(i) != n.charAt(n.length()-1-i)){
//				isPalindrom = false;
//				break;
//			}
//		}
		
		System.out.println(isPalindrom);
	}

}
