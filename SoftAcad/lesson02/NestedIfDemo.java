package lesson02;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0;
		if (a < 0) {
			System.out.println("a is smaller than 0");
		} else {
			if (a == 0) {
				System.out.println("a is 0");
			} else {
				System.out.println("a is bigger then 0");
			}
		}
	}

}
