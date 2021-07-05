package BinarySearch;
import java.util.Scanner;

public class SearchInANearlySortedArray_9 {

	/*
	SEARCH IN A NEARLY SORTED ARRAY:

	Given an array which is sorted, but after sorting some elements are moved to either of the adjacent positions, i.e.,
	arr[i] may be present at arr[i+1] or arr[i-1].
	Write an efficient function to search an element in this array.
	Basically the element arr[i] can only be swapped with either arr[i+1] or arr[i-1].
	
	For example consider the array {2, 3, 10, 4, 40}, 4 is moved to next position and 10 is moved to previous position.
	
	Example :
	Input: arr[] =  {10, 3, 40, 20, 50, 80, 70}, key = 40
	Output: 2 
	Output is index of 40 in given array
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
		System.out.println(searchInNearlySorted(arr,x));
	}

	public static int searchInNearlySorted(int[] arr , int x) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(arr[mid]== x) {
				return mid;
			}else if(mid-1>=start && arr[mid-1]== x) {
				return mid-1;
			}else if(mid+1<=end && arr[mid+1]== x) {
				return mid+1;
			}else if(x<arr[mid]) {
				end = mid-2;
			}else if(x>arr[mid]) {
				start = start+2;
			}
			
		}
		return -1;
		
		
	}
}
