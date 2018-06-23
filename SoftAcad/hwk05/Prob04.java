package hwk05;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		System.out.println("Enter m: ");
		int m = scan.nextInt();
		
		int[][] arr = new int[n][m];
		int number = 1;
		int k = 0;
		int l = 0;
		
		while ((k < n) && (l < m)) {
			for (int i = l; i < m; i++) {
				arr[k][i] = number;
				number ++;
			}
			k ++;
			for (int i = k; i < n; i++) {
				arr[i][m - 1] = number;
				number ++;
			}
			m --;
			if(k < n) {
				for (int i = m - 1; i >= l; i--) {
					arr[n-1][i] = number;
					number ++;
				}
				n --;
			}
			if(l < m) {
				for (int i = n - 1; i >= k; i--) {
					arr[i][l] = number;
					number ++;
				}
				l ++;
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
