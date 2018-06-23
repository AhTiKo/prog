package task6;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many rows and colms: ");
		int m = scan.nextInt();
		int[][] arr = new int[m][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("element: ");
				arr[i][j] = scan.nextInt();
			}
		}
		int sumDiag1 = 0;
		int sumDiag2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sumDiag1 += arr[i][i];
			sumDiag2 += arr[i][arr.length-1-i];
		}
		
		if(sumDiag1 > sumDiag2) {
			System.out.println(sumDiag1);
		} else {
			System.out.println(sumDiag2);
		}
		

	}

}
