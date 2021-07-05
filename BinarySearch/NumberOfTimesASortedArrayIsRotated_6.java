package BinarySearch;
import java.util.Scanner;

public class NumberOfTimesASortedArrayIsRotated_6 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
	
		System.out.println(checkArrayRotation(arr));

	}

	private static int checkArrayRotation(int[] arr) {
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
			int prev =(mid -1+n)%n;
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
