package BinarySearch;
import java.util.Scanner;

public class BinarySearch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		System.out.println(binarySearch(arr,x));

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

}
