package chapter7;

public class Problem2 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,5,6},{2,5,6,3},{3,4,5,5},{2,2,2,0}};
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]["+ i + "]=" + arr[i][i] + "    " );
			
		}
		System.out.println();
		for (int i = 0 ; i < arr.length; i++) {
			System.out.print("arr[" + i + "]["+ (arr.length - 1 -i) + "]=" + arr[i][(arr.length - 1 -i)] + "    " );
			
		}

	}

}
