package collections;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String array: ");
		String inputLine = input.nextLine();
		String[] strArray = inputLine.split(" ");
		input.close();
		
		for (int i = 0; i < strArray.length; i++) {
			if (i != strArray.length-1){	
				if (strArray[i].equals(strArray[i+1])){
					System.out.print(strArray[i] + " ");
				}else{
					System.out.println(strArray[i]);	
					
				}
				
			}else{
				System.out.println(strArray[i]);
			}
		}

	}

}
