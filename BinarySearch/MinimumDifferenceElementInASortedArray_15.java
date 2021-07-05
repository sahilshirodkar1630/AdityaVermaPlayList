package BinarySearch;
import java.util.Scanner;

public class MinimumDifferenceElementInASortedArray_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		System.out.println(minimumDiffSortedArray(arr,x));

	}

	private static int minimumDiffSortedArray(int[] arr, int x) {
		
		
        int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+((end-start)/2);
			
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] < x) {
				start = mid+1;
			}else {
				end = mid-1;
			}
			
		}
		int val1 = Math.abs(arr[start]-x);
		int val2 = Math.abs(arr[end]-x);
		
		return Math.min(val1, val2);
		
		
		
		
	}

}
