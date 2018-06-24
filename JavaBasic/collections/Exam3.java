package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		String[] numbers = inputLine.split("[^1-9.,]+");
		double[] nums = new double[numbers.length -1];
	
		for (int i = 1; i < numbers.length; i ++){
			nums[i-1] = Double.parseDouble(numbers[i]);
		}
		double result = nums[0];
		String[] operators = inputLine.split("[\\d., ]+");
		String[] operats = new String[operators.length];
		for ( int i = 0; i < operats.length; i ++){
			operats[i] = operators[i+1];
		}
		for (int i = 1; i < nums.length; i ++){
			if (operators[i].equals("+")){
		result += nums[i];
			}else{
				if (operators[i].equals("-")){
					result -= nums[i];
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(operators));
		System.out.printf("%.7f",result);
	}

}
