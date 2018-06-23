package chapter8;

import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		int x = 4;
		int y = 3;
//int[][] arr = createMatrix(x, y);
		printMatrix(createMatrix(x, y));
		
	}
	
	public static int[][] createMatrix(int x, int y){
		return new int[x][y];
	}
	
	public static void printMatrix(int[][]arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d",arr[i][j]);
			}
			System.out.println();
		}
	}

}
