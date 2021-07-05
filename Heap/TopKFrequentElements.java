package Heap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopKFrequentElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		int[] output = topKFrequent(arr,k);
		
		for(int i  : output) {
			System.out.print(i + " ");
		}
		
	}
	
	  public static int[] topKFrequent(int[] nums, int k) {
	        
	        HashMap<Integer,Integer> maps = new HashMap<Integer,Integer>();
	        
	        for(int i = 0;i<nums.length;i++){
	            if(maps.containsKey(nums[i])){
	                maps.put(nums[i],maps.get(nums[i])+1);
	            }else {
	            maps.put(nums[i],1);
	            }
	        }
	    
	        
	        PriorityQueue<int[]> minPQ = new PriorityQueue<int[]>(
	        		new Comparator<int[]>() {
	        			@Override
	        			public int compare(int[] o1, int[] o2) {
	        				
	        				return o1[0]-o2[0];
	        				
	        			}

	        		});
	        
	        
	        for(int i = 0 ;i<nums.length;i++){
	            if(maps.get(nums[i])>0){
	                  minPQ.add(new int[] {maps.get(nums[i]),nums[i]});
	            }
	            maps.put(nums[i],0);
	            
	            if(minPQ.size()>k){
	                minPQ.remove();
	            }
	            
	        }
	        
	        int[] arr = new int[k];
	        int i = k-1;
	        while(minPQ.size()!=0){
	            arr[i] = minPQ.remove()[1];
	            i--;
	        }
	        return arr;
	    }

}
