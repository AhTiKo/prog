package hwk02;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ����: ");
		float money = scan.nextFloat();
		System.out.println("���� ��� �����: ");
		boolean isHealthy = scan.nextBoolean();
		String result = "";
		if (isHealthy) {
			result += "�� ������ ";
			if (money < 10) {
				result += " � �� ���� �� ����!";
			} else { 
				result += " � �� ���� �� ����!";
			}
		} else {
			result += "���� �� �������";
			if (money < 10) {
				result += " � �� ��� ���!";
			} else { 
				result += " � �� �� ���� ���������!";
			}
		}
		
		System.out.println(result);
	}

}
