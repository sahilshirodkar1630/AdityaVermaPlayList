package Stack;
import java.util.Scanner;
import java.util.Stack;

public class MaximumAreaHistogram {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			
			arr[i] =sc.nextInt();
			
		}		
		
		
		
		System.out.println(maxAreaHistogram(arr));
		
		
		System.out.println();
		
		
	}
	
	public static int maxAreaHistogram(int[]arr) {
		Stack<Integer> stack = new Stack<Integer>();
		
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		nextSmallestLeft(arr,left,stack);
		stack.clear();
		nextSmallestRight(arr,right,stack);
		
		int[] output = new int[arr.length];
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<output.length;i++) {
			output[i] = (right[i] - left[i]) - 1;
			output[i] = arr[i] * output[i];
			max = Math.max(max, output[i]);
		}
		
		return max;
	}
	
	private static void nextSmallestLeft(int[] arr,int[] left,Stack<Integer> s) {
		
		
		for(int i = 0 ;i < arr.length;i++) {
			if(s.isEmpty()) {
				left[i] = -1;
			}else if( arr[s.peek()] < arr[i]) {
				left[i] = s.peek(); 
			}else if( arr[s.peek()]   >= arr[i]) {
				while(!s.isEmpty() &&  arr[s.peek()] >=arr[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
					left[i] = -1;
				}else {
					left[i] = s.peek(); 
				}
			}
			
			
			s.push(i);
		}
		
		
	}
	
	private static void nextSmallestRight(int[] arr,int[] right,Stack<Integer> s) {
		// TODO Auto-generated method stub
		
	
		for(int i = arr.length - 1;i >= 0; i--) {

			if(s.isEmpty()) {
				right[i] = arr.length;
			}else if(arr[s.peek()] >= arr[i]) {
				while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
					s.pop();
				}
				if(s.isEmpty()) {
					right[i] = arr.length;
				}else {
					right[i] = s.peek();
				}
			}else {
				right[i] = s.peek();
			
			}
			s.push(i);
			
		}
	
	}
	

}
