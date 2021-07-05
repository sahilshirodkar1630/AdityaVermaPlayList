package BinarySearch;
import java.util.Scanner;

public class FindPeakElement_16 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();	
		}
		
		System.out.println(peakElement(arr));
	}

	public static int peakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
