package Stack;
import java.util.Scanner;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] =sc.nextInt();
		}
		
	 int output = rainWatertrapping( arr );
	 System.out.println(output);
	 
	}

	private static int rainWatertrapping(int[] arr) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		int maxLeft[] = new int[n];
		int maxRight[] = new int[n];
		
		maxLeft[0] = arr[0];
		
		int max = arr[0];
		
		for(int i = 1;i < n; i++) {
		
			max = Math.max(max, arr[i]);
			maxLeft[i] = max;			
		
		}
		max = arr[arr.length - 1];
		maxRight[n-1] = max;
		for(int i = n-2 ;i>=0;i--) {
			max = Math.max(max, arr[i]);
			maxRight[i] = max;
		}
		
		int water[] = new int[n];
		int sum = 0;
		for(int i = 0;i<n;i++) {
			water[i] = Math.min(maxLeft[i], maxRight[i]);
			water[i] = water[i] - arr[i];
			sum+= water[i];
			
		}
		return sum;
		
	}
	
	

}
