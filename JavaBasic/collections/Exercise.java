package collections;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: ");
		int end = input.nextInt();
		input.close();
		
		printNums(1,end);

	}
	public static void printNums(int n, int end){
		
		System.out.println(n);
		if( n < end ){
			printNums(n+1,end);
		}else{
			return;
		}
	}

}
