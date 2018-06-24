package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//int n = Integer.parseInt(inputN);
		
		String[] rows = new String[n];

		//String row0 = input.nextLine();
		//rows[0] = row0.trim();
		for(int i = 0; i < n; i ++){
			rows[i] = input.nextLine().trim();
		}
		System.out.println(Arrays.toString(rows));
	}

}
