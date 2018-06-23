package task6;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scan.nextInt();
		System.out.println("Enter M: ");
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		int x = 1;
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d ",arr[i][j]);
			}
			System.out.println();
		}
	}

}
