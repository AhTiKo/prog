package lesson13;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		printArrayInfo(arr);
		System.out.println();
		int arr2[] = {1,2};
		printArrayInfo(arr2);
		System.out.println();
		int arr3[] = null;
		printArrayInfo(arr3);
		
	}
	
	public static void printArrayInfo(int arr[]){
		try {
			System.out.println(arr.length);
			System.out.println(arr[2]);
			System.out.println("Some text");
			
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds Exception");
		}
	}

}
