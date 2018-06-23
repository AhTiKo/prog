package chapter8;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter search Fibonachi's number: ");
		int number = scan.nextInt();
		
		System.out.printf("%dth Fibonachi's element is %d %n",number,calFibNumLoop(number));
		
		System.out.println(Integer.MAX_VALUE);

	}
	
	public static long calFibNum(int n){
		if (n < 3){
			return 1;
		} else {
			return calFibNum(n -1) + calFibNum(n - 2);
		}
	}
	
	public static long calFibNumLoop(int n){
		long fn = 1;
		long fn1 = 1;
		long fn2 = 1;
		
		for (int i = 2; i < n ; i++) {
			fn = fn1 + fn2;
			fn2 = fn1;
			fn1 = fn;
		}
		return fn;
	}

}
