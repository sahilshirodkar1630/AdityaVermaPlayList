package BinarySearch;
import java.util.Scanner;

public class CountofAnElementsInaSortedArray_5 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		System.out.println(countofAnElementInSortedArray(arr,x));

	}

	public static int countofAnElementInSortedArray(int[] arr, int x) {
		
		int first = firstIndexOfAnElement(arr, x);
		int last = lastIndexOfAnElement(arr, x);
			if(first==-1){
			    return 0;
			}
		return last- first +1;

	}
	private static int firstIndexOfAnElement(int[] arr,int x) {
		int start = 0;
		int end = arr.length-1;
		int index = -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == x) {
				index = mid;
				end= mid-1;
			}else if(arr[mid]>x) {
				end = mid-1;
			}else {
				start =mid+1;
			}
			
		}
		return index;
	}
	
	private static int lastIndexOfAnElement(int[] arr,int x) {
		int start = 0;
		int end = arr.length-1;
		int index = -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == x) {
				index = mid;
				start= mid+1;
			}else if(arr[mid]>x) {
				end = mid-1;
			}else {  }
			
		}
		return index;
	}

}
