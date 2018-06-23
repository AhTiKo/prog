package lesson01;

import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How old are you? ");
		int myAge = scan.nextInt();
		System.out.println("Input long : ");
		long l = scan.nextLong();
		System.out.println("Input double: ");
		double d = scan.nextDouble();
		System.out.println("Your age is : " + myAge);
		System.out.println("Long is " + l);
		System.out.println("Double is " + d);
	}

}
