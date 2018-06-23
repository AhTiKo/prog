package task6;

public class Prob5 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf(" %5d ", arr[i][j]);
				if (j < i) {
				sum += arr[i][j];	
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println(sum);
	

	}

}
