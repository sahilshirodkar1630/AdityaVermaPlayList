package Heap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortArraybyIncreasingFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] output = frequencySort(arr);
		
		for(int i  : output) {
			System.out.print(i + " ");
		}
	}

	 public static int[] frequencySort(int[] arr) {
	        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(new Comparator<int[]>() {
	        	@Override
	        	public int compare(int[] a, int[] b) {
	        		// TODO Auto-generated method stub
	        		if(a[0]==b[0]) {
	        			return b[1] - a[1];
	        		}
	        		return a[0]-b[0];
	        	}
			});
	        HashMap<Integer,Integer> map=new HashMap<>();

	        for (int i = 0; i < arr.length; i++){
	            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	        }
	        for (int i = 0; i < arr.length; i++){
	            System.out.print(map.get(arr[i])+" ");
	        }
	        System.out.println();
	        
	        for(int i = 0;i<arr.length;i++) {
	        	
	        		System.out.println(map.get(arr[i])+" "+arr[i]);
	        		minHeap.add(new int[] {map.get(arr[i]),arr[i]});
	        
	        }
	        int i = 0;
	        while(!minHeap.isEmpty()) {
	        	arr[i] = minHeap.remove()[1];
	        	i++;
	        }
	        return arr;
	    }
}
