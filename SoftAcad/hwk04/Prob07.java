package hwk04;

import java.util.Scanner;

public class Prob07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведете дължина на масива: ");
		int len = scan.nextInt();
		int[] arr = new int[len];
		System.out.println("Въведете елементите на масива: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int maxIndex = 0;
		int maxCount = 1;
		int currentIndex = 0;
		int currentCount = 1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[currentIndex]) {
				currentCount ++;
				if (currentCount > maxCount) {
					maxCount = currentCount;
					maxIndex = currentIndex;
				}
			} else {
				currentCount = 1;
				currentIndex = i;
			}
		}
		
		System.out.print("Максималната редица е: ");
		for (int i = 0; i < maxCount; i++) {
			System.out.print(arr[maxIndex + i] + " ");
		}
	}

}
