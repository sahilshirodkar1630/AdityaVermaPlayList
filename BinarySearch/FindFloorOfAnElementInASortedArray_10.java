package BinarySearch;
import java.util.Scanner;

public class FindFloorOfAnElementInASortedArray_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		System.out.println(floorValueInSortedArray(arr,x));
	}

	public static int floorValueInSortedArray(int[] arr, int x) {
		
		int start = 0;
		int end = arr.length-1;
		int value = -1;
		while(start<=end){
			int mid = start + (end-start) / 2;
			
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid]>x) {
	
				end = mid - 1; 
			}else if(arr[mid]<x) {
				start = mid+1;
				value = arr[mid];
			}
			
			
			
		}
		return value;
		
		
	}
}
