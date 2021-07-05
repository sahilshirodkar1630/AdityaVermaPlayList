package Heap;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		System.out.println(kSmallestElement(arr, k));

	}
	
	public static int kSmallestElement(int arr[],int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int i= 0;
		while(i<arr.length) {
			
			maxHeap.add(arr[i]);
			
			if(maxHeap.size()>k) {
				maxHeap.remove();
			}
			
			i++;
			
		}
		return maxHeap.peek();
		
	}

}
