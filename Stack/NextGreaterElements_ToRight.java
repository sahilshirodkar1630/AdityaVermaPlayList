package Stack;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElements_ToRight {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] =sc.nextInt();
		}
		
		arr =  nextGreaterElements(arr);
		
		for ( int i : arr) {
			System.out.print(i + " ");
		}
		
	}
// Brute Force
	private static void nextGreaterElement(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			int max = arr[i];
			for (int j = i+1 ; j<n  ; j++) {
				if(arr[j]>max) {
					max = arr[j];
					break;
				}
			}
			arr[i] = max;
		}
	}
	
	private static int[] nextGreaterElements(int[] arr) {
		
		int ans[] = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		int k = arr.length - 1 ;
		for(int i = arr.length - 1;i >= 0; i--) {
			if(stack.isEmpty()) {
				ans[k] = -1;
				k--;
			}else if(stack.peek() >arr[i]) {
				ans[k] = stack.peek();
				k--;
			}else if(stack.peek()<=arr[i]) {
				while(!stack.isEmpty() && stack.peek()<=arr[i]) {
					stack.pop();
				}
				if(stack.isEmpty()) {
					ans[k] = -1;
					k--;
				}else {
					ans[k] = stack.peek();
					k--;
				}
			}
//			k--;
			stack.push(arr[i]);
		}
		return ans;
		
	}
	
	
}
