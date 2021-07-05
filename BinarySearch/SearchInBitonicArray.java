package BinarySearch;
import java.util.Scanner;

public class SearchInBitonicArray {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();	
		}
		
		int x = sc.nextInt();
		
		System.out.println(searchInBitonicArray(arr,x));
	}

	private static int searchInBitonicArray(int[] arr, int x) {
		
		int mid = maxInBitonicArray(arr);
		
		int first = binarySearch(arr, 0, mid-1, x);
		int last = reverseSortedArray(arr, mid, arr.length-1, x);
		
		return  Math.max(first, last);
	}
	
	
	private static int maxInBitonicArray(int[] arr) {
		
		int start = 0;
		int end = arr.length -1;
		
		while(start<end) {
			
			int mid = start +(end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {
				end = mid;
			}else {
				start= mid+1;
			}
			
		}
		
		return start;
	
	}
	

	private static int binarySearch(int[] arr, int start,int end,int x) {
		
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
	private static int reverseSortedArray(int[] arr,  int start,int end,int x) {
		
		while(start<=end) {
			int mid = start+((end-start)/2);
			if(arr[mid] == x) {
				return mid;
			}else if (arr[mid] > x) {
				start= mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}

}
