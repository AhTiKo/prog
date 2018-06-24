package introductionToava;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number N: ");
		int n = input.nextInt();
		input.close();
		int sum = 0;
		
		for(int i = 1; i <= n; i++){
			sum+=i;
		}
		
		System.out.println("Sum: "+ sum);
	}

}
