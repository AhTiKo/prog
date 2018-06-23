package lesson02;

import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();
		
		while (n >= 1) {
			if ( n % 7 == 0) {
				System.out.println(n);
			}
			n --;
		}
	}

}
