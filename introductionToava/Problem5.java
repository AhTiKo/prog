package introductionToava;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		input.close();
		
		for (int i = 0 ; i <= n ; i++ ){
			for( int j = 0; j < i ; j++ ){
				char c= 'a';
				c+=j;
				System.out.print(c+ " ");
			}
			System.out.println();
		}
		
		for (int i = n-1 ; i >= 1 ; i-- ){
			for( int j = 0; j <i ; j++ ){
				char c= 'a';
				c +=j;
				System.out.print(c+ " ");
			}
			System.out.println();
		} 
	}

}
