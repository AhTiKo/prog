package introductionToava;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();
		input.close();
		String result = "",str = "";
		
		while (n!=0){
			switch (n %10){
				case 0: str = "Gee" ;break;
				case 1: str = "Bro" ;break;
				case 2: str = "Zuz" ;break;
				case 3: str = "Ma" ;break;
				case 4: str = "Duh" ;break;
				case 5: str = "Yo" ;break;
				case 6: str = "Dis" ;break;
				case 7: str = "Hood" ;break;
				case 8: str = "Jam" ;break;
				case 9: str = "Mack" ;break;
				default: ;break;
			}
			result = str + result;
			n/=10;	
		}
		System.out.println(result);

	}

}
