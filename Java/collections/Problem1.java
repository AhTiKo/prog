package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = Integer.parseInt(input.nextLine());
		System.out.print("Enter numers: ");
		String inputLine = input.nextLine();
		String[] elements = inputLine.split(" ");
		int[] nums = new int[n];
		input.close();
		
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(elements[i]);
		}
		
		Arrays.sort(nums);
		
		for (int i : nums) {
			System.out.println(i);
		}
	}

}
