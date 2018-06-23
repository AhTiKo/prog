package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] arr = new double[10];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = scan.nextDouble();
		}
		
		System.out.println(Arrays.toString(arr));
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);

	}

}
