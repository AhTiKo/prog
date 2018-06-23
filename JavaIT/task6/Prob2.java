package task6;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many rows: ");
		int m = scan.nextInt();
		System.out.println("how many colms: ");
		int n = scan.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("element: ");
				arr[i][j] = scan.nextInt();
			}
		}
		int bestSum = 0;
		int bestRow = 0;
		for (int i = 0; i < m; i++) {
			int currentSum = 0;
			for (int j = 0; j < m; j++) {
				currentSum += arr[i][j];
			}
			if (currentSum > bestSum) {
				bestSum = currentSum;
				bestRow = i;
			}
		}
		System.out.println("Best sum is " + bestSum + "  on row :");
		for (int i = 0; i < arr[bestRow].length; i++) {
			System.out.printf(" %5d", arr[bestRow][i]);
		}

	}

}
