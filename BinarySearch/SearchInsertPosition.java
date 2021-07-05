package BinarySearch;

public class SearchInsertPosition {

	/*
	35. Search Insert Position
	Given a sorted array of distinct integers and a target value, return the index if the target is found.
	If not, return the index where it would be if it were inserted in order.
	
	You must write an algorithm with O(log n) runtime complexity.
	
	Example 1:
	Input: nums = [1,3,5,6], target = 5
	Output: 2
	
	Example 2:
	Input: nums = [1,3,5,6], target = 2
	Output: 1
	
	Example 3:
	Input: nums = [1,3,5,6], target = 7
	Output: 4
	
	Example 4:
	Input: nums = [1,3,5,6], target = 0
	Output: 0
	
	Example 5:
	Input: nums = [1], target = 0
	Output: 0
	 
		
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public int searchInsert(int[] arr, int x) {
	        
			int start = 0;
			int end = arr.length - 1;
			if(x>arr[end]){
	            return end+1;
	        }else if(x<arr[start]){
	            return 0;
	        }
	        
			int value = -1;
			while(start <= end) {
				
				int mid = start+(end-start)/2;
				
				if(arr[mid]== x) {
					return mid;
				}else if(arr[mid]<x) {
					start = mid+1;
				}else {
					end= mid - 1;
					value = mid;
				}
				
				
			}
			return value;
			
	    }
	
	
}
