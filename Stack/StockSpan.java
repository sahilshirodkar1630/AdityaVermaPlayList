package Stack;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {


	public static void main(String args[]) {
			
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] =sc.nextInt();
		}
		
		arr =  stockSpan(arr);
		
		for ( int i : arr) {
			System.out.print(i + " ");
		}
		
	}

	
	private static int[] stockSpan(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		 int ans[] = new int[n];
			
			Stack<int[]> s = new Stack<int[]>();
			int k = 0;
			for(int i = 0 ;i < arr.length;i++) {
				if(s.isEmpty()) {
					ans[k++] = -1;
				}else if( s.peek()[0] > arr[i]) {
					ans[k++] = s.peek()[1]; 
				}else if(s.peek()[0] <= arr[i]) {
					while(!s.isEmpty() && s.peek()[0]<=arr[i]) {
						s.pop();
					}
					if(s.isEmpty()) {
						ans[k++] = -1;
					}else {
						ans[k++] = s.peek()[1]; 
					}
				}
				
				s.push(new int[] {arr[i],i});
			}
			
			for(int i = 0; i<n; i++) {
				ans[i] = i- ans[i];
			}
			
			return ans;

	}


}
