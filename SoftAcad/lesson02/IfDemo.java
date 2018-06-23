package lesson02;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("You age is " + age);
		boolean isNotOldEnough =  age < 18;
		
		if (isNotOldEnough) {
			System.out.println("You are too young to bet!");
		} else {
			System.out.println("You can bet!");
			if (age > 20) {
				System.out.println("You can drink alcochol");	
			} else {
				System.out.println("You cannot drink");
			}
		}
		
		System.out.println("End of program");
	}

}
