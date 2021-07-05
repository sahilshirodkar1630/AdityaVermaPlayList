package BinarySearch;
import java.util.Scanner;

public class AllocateMinimumNumberOfPages {
/*
	ALLOCATE MINIMUM NUMBER OF PAGES:

		Given number of pages in n different books and m students. 
		The books are arranged in ascending order of number of pages. 
		Every student is assigned to read some consecutive books. 
		The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.

		Example :

		Input : pages[] = {12, 34, 67, 90}
		        m = 2
		Output : 113
		Explanation:
		There are 2 number of students. Books can be distributed 
		in following fashion : 
		  1) [12] and [34, 67, 90]
		      Max number of pages is allocated to student 
		      2 with 34 + 67 + 90 = 191 pages
		  2) [12, 34] and [67, 90]
		      Max number of pages is allocated to student
		      2 with 67 + 90 = 157 pages 
		  3) [12, 34, 67] and [90]
		      Max number of pages is allocated to student 
		      1 with 12 + 34 + 67 = 113 pages

		Of the 3 cases, Option 3 has the minimum pages = 113. 
*/	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		int k = sc.nextInt();
		System.out.println(allocatePages(arr,k));
	}

	private static int allocatePages(int[] arr,int k) {
		
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = 0;i<n;i++) {
			max = Math.max(max, arr[i]);
			sum+=arr[i];
		}
		
		int  result = 0;
		
		int start = max;
		int end = sum;
		
		while(start<=end){
			
			int mid = start+ (end-start)/2;
			
			if(isValid(arr,n,k,mid)) {
				result = mid;
				end= mid-1;
			}else {
				start = mid+1;
			}
			
		}
		return result;
		
	}

	private static boolean isValid(int[] arr, int n, int k, int mid) {
		
		int numOfStudents = 1;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			
			sum = sum+arr[i];
			
			if(sum >mid) {
				numOfStudents++;
				sum = arr[i];
				
			}
			if(numOfStudents>k) {
				return false;
			}
			
			
		}
		
		
		return true;
	}

}
