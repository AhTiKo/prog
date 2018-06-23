package chapter7;

public class Problem3 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][]arrRot= new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arrRot[i][j] = arr[arr.length-1-j][i];
			}
		}
			
		for (int i = 0; i < arrRot.length; i++) {
			for (int j = 0; j < arrRot[0].length; j++) {
				System.out.printf("%5d", arrRot[i][j]);
			}
			System.out.println();
		}
		
	}

}
