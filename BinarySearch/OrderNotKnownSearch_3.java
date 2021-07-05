package BinarySearch;
import java.util.Scanner;

public class OrderNotKnownSearch_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		System.out.println(orderNotKnownSearch(arr,x));

	}

	private static int orderNotKnownSearch(int[] arr, int x) {
		// TODO Auto-generated method stub
		int n = arr.length;
		if(n==1) {
			if(arr[0]== x) {
				return 0;
			}else return -1;
		}
		
		if(arr[0]<arr[n-1]) {
			return binarySearch(arr, x);
		}else {
			return reverseSortedArray(arr, x);
		}
	}
	
	private static int binarySearch(int[] arr, int x) {
		
        int start = 0;
		int end = arr.length-1;
		
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

	private static int reverseSortedArray(int[] arr, int x) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start+((end-start)/2);
			if(arr[mid] == x) {
				return mid;
			}else if (arr[mid] > x) {
				start= start+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}

}
