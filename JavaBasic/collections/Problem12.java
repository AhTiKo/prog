package collections;

import java.util.Scanner;

public class Problem12 {
	
	public static int calcFact(int n){
		if (n == 0){
			return 1;
		}else{
			return n * calcFact(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		int n = input.nextInt();
		
		System.out.println(calcFact(n));

	}

}
