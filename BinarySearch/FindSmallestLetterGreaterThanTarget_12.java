package BinarySearch;

public class FindSmallestLetterGreaterThanTarget_12 {
/*
Given a characters array letters that is sorted in non-decreasing order and a character target,
return the smallest character in the array that is larger than target.

Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 

Example 1:
Input: letters = ["c","f","j"], target = "a"
Output: "c"

Example 2:
Input: letters = ["c","f","j"], target = "c"
Output: "f"

Example 3:
Input: letters = ["c","f","j"], target = "d"
Output: "f"

Example 4:
Input: letters = ["c","f","j"], target = "g"
Output: "j"

Example 5:
Input: letters = ["c","f","j"], target = "j"
Output: "c"
	
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	public char nextGreatestLetter(char[] arr, char target) {
        
        int start  = 0;
        int end = arr.length-1;
        
        char value = '-';
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]<=target){
                start = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
                value = arr[mid];
            }
        }
        
        return value=='-'?arr[0]:value;
        
    }
}
