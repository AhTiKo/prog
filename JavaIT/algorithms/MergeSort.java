package algorithms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = createArr(50);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(mergeSort(arr)));

	}
	
	public static int[] createArr(int len) {
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*1001);
		}
		return arr;
	}
	
	public static int[] mergeSort(int[] arr) {
		if (arr.length > 1) {
			int elementsInA1 = arr.length/2;
			int elementsInA2 = arr.length - elementsInA1;
			int[] arr1 = new int[elementsInA1];
			int[] arr2 = new int[elementsInA2];
			
			for (int i = 0; i < elementsInA1; i++) {
				arr1[i] = arr[i];
			}
			
			for (int i = elementsInA1; i < elementsInA1 + elementsInA2; i ++) {
				arr2[i-elementsInA1] = arr[i];
			}
			
			mergeSort(arr1);
			mergeSort(arr2);
			
			int indexArr = 0;
			int indexArr1 = 0;
			int indexArr2 = 0;
			
			while (indexArr1 < arr1.length && indexArr2 < arr2.length) {
				if(arr1[indexArr1] < arr2[indexArr2]) {
					arr[indexArr] = arr1[indexArr1];
					indexArr1 ++;
				} else {
					arr[indexArr] = arr2[indexArr2];
					indexArr2 ++;
				}
				indexArr ++;
			}
			
			while (indexArr1 < arr1.length) {
				arr[indexArr] = arr1[indexArr1];
				indexArr1 ++;
				indexArr ++;
			}
			
			while (indexArr2 < arr2.length) {
				arr[indexArr] = arr2[indexArr2];
				indexArr2 ++;
				indexArr ++;
			}
		}
		return arr;
	}


}
