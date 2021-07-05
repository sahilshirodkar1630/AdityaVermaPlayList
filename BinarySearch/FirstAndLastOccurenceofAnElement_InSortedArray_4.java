package BinarySearch;
import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class FirstAndLastOccurenceofAnElement_InSortedArray_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int x = sc.nextInt();
		firstandLastIndexOfAnElement(arr,x);

	}

	public static void firstandLastIndexOfAnElement(int[] arr, int x) {
		
		System.out.println(firstIndexOfAnElement(arr, x));
		System.out.println(lastIndexOfAnElement(arr, x));
		

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
			}else {
				start =mid+1;
			}
			
		}
		return index;
	}
}
