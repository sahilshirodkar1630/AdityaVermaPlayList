package Heap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class KClosestNumbers {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		int x = sc.nextInt();
		ArrayList<Integer> output = ClosestNumbers(arr,k,x);
		
		for(int i  : output) {
			System.out.print(i + " ");
		}
	}

	public class pair{
		int first;
		int second;
	}
	
	private static ArrayList<Integer> ClosestNumbers(int[] arr, int k,int x) {
		// TODO Auto-generated method stub

		PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o2[1]-o1[1];
			}
		});
		int i = 0;
		for(;i<k;i++) {
			maxHeap.add(new int[] {arr[i],Math.abs(arr[i]-x)});
		}
		
		for(;i < arr.length; i++) {
			int temp = Math.abs(arr[i]-x);
			if(temp<maxHeap.peek()[1]) {
				maxHeap.add(new int[] {arr[i],Math.abs(arr[i]-x)});
				maxHeap.remove();
			}
		}
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		while(!maxHeap.isEmpty()) {
			int[] temp = maxHeap.remove();
			System.out.println(temp[0]);
			output.add(temp[0]);
		}
		
		
		
		return output;
	}

}
