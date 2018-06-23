package chapter7;

public class Problem1 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,5,6,7},{2,5,6,3},{3,4,5,5,0},{2,2,2,0}};
		int count;
		int countMax = 1;
		int rowMax = 0;
		int colMax = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				count = 1;
				for (int i2 = i; i2 < arr.length; i2++) {
					for (int j2 = 0; j2 < arr[i2].length; j2++) {
						if((i == i2) && (j == j2)){
							continue;
						} else {
							if (arr[i2][j2] == arr[i][j]) {
								count ++;
								if (count > countMax) {
									countMax = count;
									rowMax = i;
									colMax = j;
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println("element is " + arr[rowMax][colMax]);
		System.out.println("count is " + countMax);

	}

}
