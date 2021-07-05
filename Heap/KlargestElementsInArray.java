package Heap;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KlargestElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		ArrayList<Integer> output = KlargestElements(arr,k);
		
		for(int i  : output) {
			System.out.print(i + " ");
		}
		
		
	}

	private static ArrayList<Integer> KlargestElements(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		for(int i = 0 ;i<arr.length;i++) {
			minHeap.add(arr[i]);
			if(minHeap.size()>k){
				minHeap.remove();
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while(!minHeap.isEmpty()) {
			ans.add(minHeap.remove());
		}
		return ans;
	}

}
