package lesson04;

public class ArrayTraverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = 7;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
