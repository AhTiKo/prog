package task6;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many rows: ");
		int rows = scan.nextInt();
		System.out.println("how many colms: ");
		int colms = scan.nextInt();
		int[][] arr = new int[rows][colms];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.println("element: ");
				arr[i][j] = scan.nextInt();
			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.printf("%5d",arr[i][j]);
				
			}
			System.out.println();
		}
	}

}
