package lesson02;

import java.util.Scanner;

public class Fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = scan.nextInt();
		int fib1 = 1;
		int fib2 = 1;
		int fibN  = 0;
		int i = 2;
		if(n == 0){
			fibN = 0;
		} else if(n == 1 || n == 2) {
			fibN = 1;
		} else {
			while (i < n) { 
				fibN = fib1 + fib2;
				fib1 = fib2;
				fib2 = fibN;
				i++;
			}
		}
		
		System.out.println(fibN);
	}

}
