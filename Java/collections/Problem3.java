package collections;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String array: ");
		String inputLine = input.nextLine();
		String[] strArray = inputLine.split(" ");
		String element = strArray[0];
		String bestElement = strArray[0];
		input.close();
		int count = 1;
		int bestCount = 1;
		for (int i = 1; i < strArray.length; i++) {
			if(strArray[i].equals(element)){
				count += 1;
				if (count > bestCount){
					bestCount = count;
					bestElement = element;
				}
			}else{
				count = 1;
				element = strArray[i];
			}
		}
		
		for (int i = 1; i <= bestCount; i++){
			System.out.print(bestElement + " ");
		}
	}

}
