package BinarySearch;
import java.util.Scanner;

public class CeilOfAnElementInASortedArray_11 {

	/*
	CEILING OF AN ELEMENT IN A SORTED ARRAY:

	Given a sorted array and a value x, the ceiling of x is the smallest element in array greater than or equal to x,
	and the floor is the greatest element smaller than or equal to x. Assume than the array is sorted in non-decreasing order.
	Write efficient functions to find floor and ceiling of x.
	
	Examples :
	For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
	For x = 0:    floor doesn't exist in array,  ceil  = 1
	For x = 1:    floor  = 1,  ceil  = 1
	For x = 5:    floor  = 2,  ceil  = 8
	For x = 20:   floor  = 19,  ceil doesn't exist in array
	
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		System.out.println(ceilValueInSortedArray(arr,x));
		
	}
	
	public static int ceilValueInSortedArray(int[] arr, int x) {
		
		int start = 0;
		int end = arr.length - 1;
		
		int value = -1;
		while(start <= end) {
			
			int mid = start+(end-start)/2;
			
			if(arr[mid]== x) {
				return mid;
			}else if(arr[mid]<x) {
				start = mid+1;
			}else {
				end= mid - 1;
				value = arr[mid];
			}
			
			
		}
		return value;
	
		
	}

	
	
	
}
