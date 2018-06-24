import java.util.Scanner;


public class Exercise1 {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		 int firstNum = input.nextInt();
		 System.out.println("Enter second number: ");
		 int secondNum = input.nextInt();
		 
		 if (firstNum > secondNum){
			 int temp = firstNum;
			 firstNum = secondNum;
			 secondNum = temp; 
		 }
		 System.out.println("first number is " + firstNum);
		 System.out.println("second number is " + secondNum);
	}

}
