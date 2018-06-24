package collections;

import java.util.Scanner;

public class Problem11 {
	
	public static int binarySearch(int[] arr, int x){
		int mid;
		int left = 0;
		int rigth = arr.length-1;
		while (left <= rigth){
			mid = (left+rigth)/2;
		
			if (arr[mid] > x){
				rigth = mid-1;
			}else{
				if (arr[mid] < x){
					left = mid+1;
				}else{
					if (arr[left]==x){
						return left;
					}else{
					return mid;
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		int x = input.nextInt();
		String[] arr = inputLine.split(" ");
		int[] array = new int[arr.length];
		
		for (int i = 0; i < array.length; i++) {
			array[i]=Integer.parseInt(arr[i]);
		}
		
		int ans = binarySearch(array,x);
		
		System.out.println(ans);
	}
	
}
	
	
	

        
