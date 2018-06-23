package lesson04;

import java.util.Random;

public class MulArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 7;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (int j = 0; j < arr.length; j++) {
			arr[j] *= 2;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
