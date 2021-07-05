package BinarySearch;
import java.util.Scanner;

public class SingleElementInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		
		You are given a sorted array consisting of only integers where every element appears exactly twice, 
		except for one element which appears exactly once. Find this single element that appears only once.

		Follow up: Your solution should run in O(log n) time and O(1) space.

		Example 1:
		Input: nums = [1,1,2,3,3,4,4,8,8]
		Output: 2
		
		Example 2:
		Input: nums = [3,3,7,7,10,11,11]
		Output: 10
*/
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println(singleNonDuplicate(arr));
	}
	
	

	 public static  int singleNonDuplicate(int[] arr) {
		 
	    int start = 0;
	    int end = arr.length -1;
	    
	    while(start<end) {
	    	int mid = start + (end-start)/2;
	    
	    	if(mid%2==0 && arr[mid]== arr[mid+1] || mid%2 != 0 && arr[mid] == arr[mid-1] ) {
	    		start = mid+1;
	    		
	    	}else {
	    		end = mid;
	    	}
	    }
	    return arr[start];
		 
	 }
}
