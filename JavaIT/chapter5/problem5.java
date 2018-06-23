package chapter5;

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number p : ");
		int p = scan.nextInt();
		System.out.print("Enter number q : ");
		int q = scan.nextInt();
		
		for(int i = 1; i <= p; i++){
			for(int j = 1; j <= q; j ++){
				System.out.print(i +" " + j + "     ");
			}
			System.out.println();
		}
	}

}
