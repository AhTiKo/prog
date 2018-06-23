package algorithms;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] resultint = countingSort(new int[]{6,4,7,1,89,3,7,2,45,23,11,9,5,1});
		System.out.println(Arrays.toString(resultint));

	}
	
	static int[] countingSort(int[] nums) {
		int maxNum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (maxNum < nums[i]) {
				maxNum = nums[i];
			}
		}
		int[] numCount = new int[maxNum +1];
		int[] result = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			numCount[nums[i]]++;
		}
		
		for (int i = 1; i < numCount.length; i++) {
			numCount[i] += numCount[i-1];
			
		}
		
		for (int i = 0; i < nums.length; i++) {
			
			int num = nums[i];
			numCount[num]--;
			int pos = numCount[num];
			result[pos]=num;
		}
		
		return result;
	}

}
