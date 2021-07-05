package BinarySearch;
import java.util.Scanner;

public class FindMaximumElementInBitonicArray {

	public static void main(String[] args) {
//	 1 3 8 12 9 2

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();	
		}
		
		System.out.println(maxInBitonicArray(arr));
	}

	private static int maxInBitonicArray(int[] arr) {
		
		int start = 0;
		int end = arr.length -1;
		
		while(start<end) {
			int mid = start +(end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}else {
				start= mid+1;
			}
		}
		
		return start;
	
	}
	
	

}
