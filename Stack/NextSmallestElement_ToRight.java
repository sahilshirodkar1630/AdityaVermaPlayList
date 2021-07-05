package Stack;
import java.util.Scanner;
import java.util.Stack;

public class NextSmallestElement_ToRight {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] =sc.nextInt();
		}
		
		arr =  nextSmallestElementsRight(arr);
		
		for ( int i : arr) {
			System.out.print(i + " ");
		}
		
	}

	private static int[] nextSmallestElementsRight(int[] arr) {
		// TODO Auto-generated method stub
		int ans [] = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		int k = arr.length - 1 ;
		for(int i = arr.length - 1;i >= 0; i--) {
			if(stack.isEmpty()) {
				ans[i] = -1;
			}else if(stack.peek() < arr[i]) {
				ans[i] = stack.peek();
			}else if(stack.peek() >= arr[i]) {
				while(!stack.isEmpty() && stack.peek() >= arr[i]) {
					stack.pop();
				}
				if(stack.isEmpty()) {
					ans[i] = -1;
				}else {
					ans[i] = stack.peek();
				}
			}

			stack.push(arr[i]);
		}
		return ans;
	}


}
