package task6;

public class Prob7 {

	public static void main(String[] args) {
		int[][] arr = {{9,9,2,2},{2,9,3,2},{2,2,2,2},{2,2,6,6},{9,4,4,9}};
		
		int bestSum = arr[0][0];
		int sum = 0;
		int bestRow = 0;
		int bestColm = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[0].length - 1; j++) {
				sum = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1];
				if(sum > bestSum) {
					bestSum = sum;
					bestRow = i;
					bestColm = j;
				}
			}	
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d ",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Best sum = " + bestSum);
		System.out.println("The submatrix is ");
		System.out.printf("%5d %5d %n",arr[bestRow][bestColm], arr[bestRow][bestColm + 1]);
		System.out.printf("%5d %5d",arr[bestRow + 1][bestColm], arr[bestRow + 1][bestColm + 1]);
		
	}

}
