package Heap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortKSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		kSortedElements(arr, k);
		
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		
	}

	private static void kSortedElements(int[] arr, int k) {

		PriorityQueue<Integer> minheap  = new PriorityQueue<Integer>();
		int i = 0;
		for(;i<=k;i++) {
			minheap.add(arr[i]);
		}
		
		while(!minheap.isEmpty()) {
			arr[i-k-1] = minheap.remove();
			if(i<arr.length) {
				minheap.add(arr[i]);
			}
			i++;
		}
		
		
	}

}
