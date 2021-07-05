package BinarySearch;
import java.util.Scanner;

public class IndexOfFirst1InABinarySortedInfiniteArray_14 {
/*
Given an infinite sorted array consisting 0s and 1s.
The problem is to find the index of first ‘1’ in that array. 
As the array is infinite, therefore it is guaranteed that number ‘1’ will be present in the array.

Example:
Input : arr[] = {0, 0, 1, 1, 1, 1} 
Output : 2
	
	
*/
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(indexOfInfiniteSortedArray(arr));
	}

	private static int indexOfInfiniteSortedArray(int[] arr) {

		int start = 0;
		int end = 1;
		
		while(1 >arr[end] ) {
			start = end;
			end = end*2;
		}
		
		return firstIndexOfAnElement(arr,start,end);
		
	}
	
	private static int firstIndexOfAnElement(int[] arr,int start , int end) {
		int index = -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == 1) {
				index = mid ;
				end = mid-1;
			}else if(arr[mid] > 1) {
				end = mid -1;
			} else {
				start = mid+1;
			}
			
			
		
			
		}
		return index;
	}

}
