package lesson02;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();
		int result = 1;
		while (n > 0) {
			result *= n;
			n --;
		}
		
		System.out.println(result);
	}

}
