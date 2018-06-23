package task7;

import java.util.Arrays;

public class Prob8 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(numberDevFive()));

	}

	private static int[] numberDevFive() {
		int counter = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				counter ++;
			}
		}
		int[] arr = new int[counter];
		counter = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				arr[counter] = i;
				counter ++;
			}
		}
		return arr;
	}

}
