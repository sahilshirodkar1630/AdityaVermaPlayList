package Stack;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementI_496 {
/*
	You are given two integer arrays nums1 and nums2 both of unique elements, where nums1 is a subset of nums2.

	Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

	The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, return -1 for this number.

	 

	Example 1:

	Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
	Output: [-1,3,-1]
	Explanation:
	For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
	For number 1 in the first array, the next greater number for it in the second array is 3.
	For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
	
	Example 2:
	Input: nums1 = [2,4], nums2 = [1,2,3,4]
	Output: [3,-1]
	Explanation:
	For number 2 in the first array, the next greater number for it in the second array is 3.
	For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
	*/
	
	 public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();
	        for(int i = 0 ;i < nums1.length;i++){
	            maps.put(nums1[i],i);
	        }
	        
	        int ans[] = new int[nums1.length];
			Stack<Integer> stack = new Stack<Integer>();
			
			for(int i = nums2.length - 1;i >= 0; i--) {
	            if(maps.containsKey(nums2[i])){
	                int k = maps.get(nums2[i]);
	                
	                if(stack.isEmpty()) {
					    ans[k] = -1;
	                }else if(stack.peek() >nums2[i]) {
	                    ans[k] = stack.peek();
	                }else if(stack.peek()<=nums2[i]) {
	                    while(!stack.isEmpty() && stack.peek()<=nums2[i]) {
	                        stack.pop();
	                    }
	                    if(stack.isEmpty()) {
	                        ans[k] = -1;
	                    }else {
	                        ans[k] = stack.peek();
	                    }
	                }
	            }
	            stack.push(nums2[i]);
	        }
			return ans;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			arr1[i] =sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int [m];
		
		for(int i = 0 ; i < n ; i++) {
			arr2[i] =sc.nextInt();
		}
		
		int[] ans =  nextGreaterElement(arr1,arr2);
		
		for ( int i : ans) {
			System.out.print(i + " ");
		}
	}

}
