package Stack;
import java.util.Scanner;
import java.util.Stack;

public class MaxAreaRectangleInBinaryMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for(int i = 0 ;i<n;i++) {
			for(int j = 0 ; j<m;j++) {
				
				arr[i][j] = sc.nextInt();
				
			}
		}
		
		int ans = MaxAreaRectBinaryMatrix(arr);
		System.out.println(ans);
		
	}
	
	
	
	public static int MaxAreaRectBinaryMatrix(int[][] matrix ) {
		int ans[] = new int[matrix[0].length];
		
		int max = Integer.MIN_VALUE;
		
		int n = matrix.length;
		int m = matrix[0].length;
		
		for(int i  = 0 ;i < m; i++) {
			ans[i] = matrix[0][i] ;
		}
		max = Math.max(max,maxAreaHistogram(ans));
		for(int i = 1; i < n;i++) {
			for(int j = 0;j< m;j++) {
				
				if(matrix[i][j] == 0) {
					ans[j] = 0;
				}else {
					ans[j] = ans[j] + matrix[i][j];
				}
				
				
			}
			max = Math.max(max,maxAreaHistogram(ans));
			
		}
		return max;
		
		
		
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
