package javaSyntax;

import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {
	
	public static void printOddEven(int nums[]){
		for(int i = 0; i < nums.length; i+=2){
			if ((nums[i] % 2 == 0) & (nums[i+1] % 2 == 0)){
				System.out.printf("%d, %d -> both are even %n", nums[i], nums[i+1]);
			}else{
				if ((nums[i] % 2 == 1) & (nums[i+1] % 2 == 1)){
					System.out.printf("%d, %d -> both are odd %n", nums[i], nums[i+1] );
				}else{
					System.out.printf("%d, %d -> different %n", nums[i], nums[i+1]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter int array: ");
		String inputLine = input.nextLine();
		String[] elements = inputLine.split("\\s+"); 
		int[] nums = new int[elements.length];
		
		for(int i = 0; i < elements.length; i++){
			nums[i] = Integer.parseInt(elements[i]);
		}
		
		if (nums.length % 2 == 0){
			printOddEven(nums);
		}else{
			System.out.println("Invalid length!");
		}	
	
	}

}
