package BinarySearch;
import java.util.Scanner;

public class SearchInInfiniteSortedArray_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		System.out.println(searchInInfiniteSortedArray(arr,x));
	}

	private static int searchInInfiniteSortedArray(int[] arr, int x) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = 1;
		
		while(x>arr[end]) {
			start = end;
			end = end*2;
		}
		
		return binarySearch(arr,x,start,end);
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

}
