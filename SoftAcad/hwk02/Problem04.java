package hwk02;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Сума пари: ");
		float money = scan.nextFloat();
		System.out.println("Дали съм здрав: ");
		boolean isHealthy = scan.nextBoolean();
		String result = "";
		if (isHealthy) {
			result += "Ще изляза ";
			if (money < 10) {
				result += " и ще ходя на кафе!";
			} else { 
				result += " и ще ходя на кино!";
			}
		} else {
			result += "Няма да излизам";
			if (money < 10) {
				result += " и ще пия чай!";
			} else { 
				result += " и ще си купя лекарства!";
			}
		}
		
		System.out.println(result);
	}

}
