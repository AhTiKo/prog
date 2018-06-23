package task10;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = scan.nextInt();
		System.out.print("Enter colms: ");
		int colms = scan.nextInt();
		int[][] arr = new int[rows][colms];
		System.out.println("Enter elemets: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int ans = binarySearchMatrix(arr, 0, 0, rows -1, colms -1);
		if (ans != -1) {
			System.out.println("answer is " + ans);
		} else {
			System.out.println("number not found ");
		}
		

	}
	
	static int binarySearchMatrix (int[][] arr, int leftRow, int leftColm, int rightRow,  int rightColm ){
		Scanner scan = new Scanner(System.in);
		if ((leftColm > rightColm) && (leftRow >= rightRow)){
			return - 1;
		}
		if (leftRow != rightRow){
			int midRow = (leftRow + rightRow) / 2;
			System.out.print(arr[midRow][rightColm] + " ? ");
			int ans = scan.nextInt();
			if (ans == 2) {
				return binarySearchMatrix(arr, midRow + 1, leftColm, rightRow, rightColm);
			} else {
				if (ans == 0) {
					return binarySearchMatrix(arr, leftRow, leftColm, midRow, rightColm);
				} else {
					return arr[midRow][rightColm];
				}
			}
		}
		int midColm = (leftColm + rightColm) / 2 ;
		System.out.println(arr[leftRow][midColm] + " ? " );
		int ans = scan.nextInt();
		if (ans == 1) {
			return arr[leftRow][midColm];
			
		} else {
			if (ans == 0) {
				return binarySearchMatrix(arr, leftRow, leftColm, rightRow, midColm - 1);
			} else {
				if (ans == 2) {
					return binarySearchMatrix(arr, leftRow, midColm + 1, rightRow, rightColm);
				}
			}
			return -1;
		}
		
	}
		

}
