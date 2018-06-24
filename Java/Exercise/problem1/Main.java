package problem1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length: ");
		double length = input.nextDouble();
		System.out.print("Enter width: ");
		double width = input.nextDouble();
		System.out.print("Enter heigth: ");
		double heigth = input.nextDouble();
		
		input.close();
		
		Box box = new Box(length,width,heigth);
		System.out.printf("volume: %.2f \n",box.volume());
		System.out.println( box.surfaceArea()+" "+box.literalSurfaceArea()+" " +box.volume());
		
	}

}
	
