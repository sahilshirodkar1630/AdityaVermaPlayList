package BinarySearch;
import java.util.Scanner;

public class FindMinimumInRotatedSortedArray_7 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub;
			
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int i = 0;i<n;i++) {
				
				arr[i] = sc.nextInt();
				
			}
		
			System.out.println(findMin(arr));

		}

		
		 public static int findMin(int[] arr) {
			 
	         if(arr.length==2){
		            if(arr[0]<arr[1])
		                return arr[0];
		            else 
	                    return arr[1];
		    }
	         
	        int n = arr.length -1;
			int start = 0;
			int end = arr.length-1;
			int small= -1;
			while(start<=end) {
				if(arr[start] <= arr[end]){
	                return arr[start];
	            }
				
				int mid = start+ ((end- start)/2);
				int next =(mid + 1)%n ;
				int prev =(mid -1+n)%n;
				if(arr[mid]<=arr[next] &&  arr[mid]<=arr[prev] ) {
					return arr[mid]; 
				}
				 if(arr[start]<=arr[mid]) {	
					start= mid+1;
				}else if (arr[mid]<= arr[end]) {
					end = mid -1;
				}
				
			}
			
			return small;
	    }

	

}
