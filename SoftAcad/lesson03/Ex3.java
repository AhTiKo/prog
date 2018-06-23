package lesson03;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();
		float result = 0f;
		int fact = 1;
		for (int i = 1; i <= n ; i++) {
			fact *= i;
			int nn = 1;
			for (int j = 1; j <= i; j++) {
				nn *= i;
			}
				
			result += (float) fact / nn;
			
		}
		
		System.out.println(result);
		
	}

}
