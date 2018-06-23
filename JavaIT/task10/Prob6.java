package task10;

import java.util.Scanner;

public class Prob6 {

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
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int l = 0; l < arr.length; l++) {
						if((k == rows - 1) && (l == colms - 1)) {
							continue;
						} else {
							if (l == colms - 1) {
								if(arr[k][l] > arr[k+1][0]){
									int temp = arr[k][l];
									arr[k][l] = arr[k+1][0];
									arr[k+1][0] = temp;
								}
							} else {
								if(arr[k][l] > arr[k][l + 1]){
									int temp = arr[k][l];
									arr[k][l] = arr[k][l + 1];
									arr[k][l + 1] = temp;
								}
							}
						}
					}
				}		
				
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colms; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
