package BinarySearch;
import java.util.Scanner;

public class SearchInRotatedSortedArray_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		System.out.println(searchInRotatedArray(arr,x));

	}

	private static int searchInRotatedArray(int[] arr, int x) {
	
		 int min = checkArrayRotation(arr);
			int first = binarySearch(arr, x, 0, min-1);
			int sec = binarySearch(arr, x, min, arr.length-1);
			
			return Math.max(first, sec);
		
		
	}
	  
    
	private static int binarySearch(int[] arr, int x,int start,int end) {
		
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
			
			return -1;
			
			
		}
		
		private static int checkArrayRotation(int[] arr) {
	        if(arr.length==2){
	            if(arr[0]<arr[1]){
	                return 0;
	            }else return 1;
	        }
	        
			int n = arr.length -1;
			
			int start = 0;
			int end = arr.length-1;
			
			int small= -1;
	        
			while(start<=end) {
				if(arr[start] <= arr[end]){
	                return start;
	            }
				
				int mid = start+ ((end- start)/2);
				
				int next =(mid + 1)%n ;
				int prev =(mid+n-1)%n;
				
 				if(arr[mid]<=arr[next] &&  arr[mid]<=arr[prev] ) {
					return mid; 
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
