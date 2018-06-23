package task10;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lenth :");
		int len = scan.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter elements: ");
		for (int i = 0; i < len; i++) {
			arr[i] = scan.nextInt();
		}
		int maxElem = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxElem) {
				maxElem = arr[i];
			}
		}
		
		int[] elem = new int[maxElem + 1];
		for (int i = 0; i < arr.length; i++) {
			elem[arr[i]]++;
		}
		
		int maxCount = elem[0];
		int elemMaxCount = 0;
		for (int i = 1; i < elem.length; i++) {
			if(elem[i] > maxCount){
				maxCount = elem[i];
				elemMaxCount = i;
			}
		}
		
		System.out.println("The most repetitive element is " + elemMaxCount );

	}

}
