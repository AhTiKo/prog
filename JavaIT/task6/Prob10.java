package task6;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scan.nextInt();
		System.out.println("Enter M: ");
		int m = scan.nextInt();
		int[][] arr = new int[n][m];
		int x = 1;
		
		for (int i = 0; i < arr[0].length; i++) {
			if (i % 2 != 0) {
				for (int j = arr.length - 1; j >= 0; j--) {
					arr[j][i] = x;
					x ++;
				}
			} else {
				for (int j = 0; j < arr.length; j++) {
					arr[j][i] = x;
					x++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d ",arr[i][j]);
			}
			System.out.println();
		}

	}

}
