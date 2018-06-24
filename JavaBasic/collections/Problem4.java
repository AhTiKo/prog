package collections;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array: ");
		String inputLine = input.nextLine();
		String[] elements = inputLine.split(" ");
		int[] numbers = new int[elements.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(elements[i]);
		}
		int count = 1;
		int countStart = 0;
		int bestStart = 0; 
		int bestCount = 1;
		for (int i = 1; i < numbers.length; i++){
			if(numbers[i-1] < numbers[i]){
				count +=1;
				System.out.print(numbers[i-1] + " ");
			
				if (count > bestCount){
					bestCount = count;
					bestStart = countStart;
				}
				
			}else{
				System.out.println(numbers[i-1]+ " ");
				count = 1;
				countStart = i;
			}
		}
		System.out.println(numbers[numbers.length-1]);
		System.out.print("Longest:");
		for (int i = bestStart; i < (bestStart+bestCount); i ++){
			System.out.print(numbers[i] + " ");
		}

	}

}
