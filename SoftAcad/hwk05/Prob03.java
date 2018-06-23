package hwk05;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		System.out.println("Enter m: ");
		int m = scan.nextInt();
		
		int[][] arr = new int[n][m];
		int number = 1;
		int startIndexX = n-1;
		int startIndexY = 0;
		
		while (startIndexX >= 0 && startIndexY < m) {
			for (int i = startIndexX, j = startIndexY; i < n && j < m; i++, j++) {
				arr[i][j] = number;
				number ++;
			}
			
			if(startIndexX > 0) {
				startIndexX --;
			} else {
				startIndexY ++;
			}
		}

//		for (int i = n - 1; i >= 0; i--) {
//			for (int j = i, k = 0; j < n && k < m; j++, k++) {
//				arr[j][k] = number;
//				number ++;
//			}
//		}
//		for (int i = 1; i < m; i++) {
//			for (int j = i, k = 0; j < m && k < n; j++, k++) {
//				arr[k][j] = number ++;
//			}
//		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.printf("%-4d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
