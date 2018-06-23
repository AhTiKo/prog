package task8;

public class Prob4 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(isNotRepeat(arr, 0));

	}
	
	static boolean isNotRepeat(int[] arr, int index) {
		if (index == arr.length - 1) {
			return true;
		}
		boolean isNot = true;
		for (int i = index + 1; i < arr.length; i++) {
			if(arr[index] == arr[i]){
				isNot = false;
			}
		}
		
		return isNot && isNotRepeat(arr, index + 1);
	}

}
