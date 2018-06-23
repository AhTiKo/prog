package lesson05;

public class ReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		System.out.println(arr);
		
		int[] arr1 = new int[3];
		arr1[0] = 5;
		arr1[1] = 6;
		arr1[2] = 7;
		System.out.println(arr1);
		
		if (arr == arr1) {
			System.out.println("equal references");
		} else {
			System.out.println("not equal references");
		}
	}

}
