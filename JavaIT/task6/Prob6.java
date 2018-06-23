package task6;

public class Prob6 {

	public static void main(String[] args) {
		int[][] arr = {{2,3,2,2},{2,2,3,2},{2,2,2,2},{2,2,2,2}};
		
		int sum = 0;
		int sumDiag1 = 0;
		int sumDiag2 = 0;
		boolean isMagic = true;
		for (int i = 0; i < arr.length; i++) {
			int sumRow = 0;
			int sumColm = 0;
			for (int j = 0; j < arr.length; j++) {
				sumRow += arr[i][j];
				sumColm += arr[j][i];
				if (j == i) {
					sumDiag1 += arr[i][j];
				}
				if (j == (arr.length - 1 - i)) {
					sumDiag2 += arr[i][j];
				}
			}
			if (i == 0) {
				sum = sumRow;
			}
			if ((sum != sumRow) || (sum != sumColm)) {
				isMagic = false;
				break;
			}
			
		}
		if((isMagic) && (sum == sumDiag1) && (sum == sumDiag2)) {
			System.out.println ("The matrix is magic!");
		} else {
			System.out.println ("The matrix is not magic!");
		}
	}

}
