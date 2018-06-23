package algorithms;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		int[] result = radixSort(new int[]{6,42,7,1,89,3,7457,23456,45,23,1156,96,5,125,345});
		System.out.println(Arrays.toString(result));
	}
	
	static int[] radixSort(int[] arr) {
		int maxDigits = getNumOfDigits(getMaxNum(arr));
		for (int digit = 1; digit <= maxDigits; digit++) {
			arr = countingSort(arr,digit);
		}
		return arr;
	}
	
	static int kthDigits(int num, int k) {
		int tenOnKth = (int)Math.pow(10, k-1);
		return (num / tenOnKth) % 10;
	}
	
	static int[] countingSort(int[]arr, int digit) {
		int[] numbersCount = new int[10];
		int[] result = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int num = kthDigits(arr[i],digit);
			numbersCount[num]++;	
		}
		
		for (int i = 1; i < numbersCount.length; i++) {
			numbersCount[i] += numbersCount[i-1];
		}
		
		for (int i = arr.length-1 ; i >= 0; i--) {
			int num = arr[i];
			int numDigit = kthDigits(num, digit);
			numbersCount[numDigit]--;
			int pos = numbersCount[numDigit];
			result[pos] = num;
		}
		return result;
	}
	
	static int getMaxNum(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int getNumOfDigits(int num) {
		int digitCount = 0;
		while (num > 0) {
			num /= 10;
			digitCount++;
		}
		return digitCount;
	}

}
