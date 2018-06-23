package lesson02;

import java.util.Scanner;

public class LogicalOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("You age is " + age);
		
		if ((age >= 18) && (age < 21)) {
			System.out.println("You can bet but cannot drink alcochol");
		} else {
			if (age >=18 && age >= 21) {
				System.out.println("You can bet and drink alcochol");
			} else {
				System.out.println("You are too young!");
			}
		}
			
		
	}

}
