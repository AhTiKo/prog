package hwk05;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		System.out.println("Enter m: ");
		int m = scan.nextInt();
		
		int[][] arr = new int[n][m];
		int number = 1;
		for (int i = 0; i < m; i++) {
			if(i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					arr[j][i]= number;
					number ++;
				}
			} else {
				for (int j = n -1 ; j >= 0; j--) {
					arr[j][i]= number;
					number ++;
				}
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%-4d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
