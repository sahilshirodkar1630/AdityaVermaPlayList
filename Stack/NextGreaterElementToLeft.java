package Stack;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementToLeft {

public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] =sc.nextInt();
		}
		
		arr =  nextGreaterElementsLeft(arr);
		
		for ( int i : arr) {
			System.out.print(i + " ");
		}
		
	}

private static int[] nextGreaterElementsLeft(int[] arr) {
	// TODO Auto-generated method stub
	int ans[] = new int[arr.length];
	Stack<Integer> s = new Stack<Integer>();
	
	for(int i = 0 ;i < arr.length;i++) {
		if(s.isEmpty()) {
			ans[i] = -1;
		}else if( s.peek() > arr[i]) {
			ans[i] = s.peek(); 
		}else if(s.peek()  <= arr[i]) {
			while(!s.isEmpty() && s.peek()<=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				ans[i] = -1;
			}else {
				ans[i] = s.peek(); 
			}
		}
		
		
		s.push(arr[i]);
	}
	
	return ans;
}

}
