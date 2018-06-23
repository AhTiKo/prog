package hwk04;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете число: ");
		int n = scan.nextInt();
		int[] arr = new int[10];
		
		arr[0] = n;
		arr[1] = n;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
