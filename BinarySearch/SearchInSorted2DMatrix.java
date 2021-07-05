package BinarySearch;
import java.util.Scanner;

public class SearchInSorted2DMatrix {
/*
	SEARCH IN A ROW WISE AND COLUMN WISE SORTED MATRIX:

		Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it.
		Otherwise, print “Not Found”. In the given matrix, every row and column is sorted in increasing order. 
		The designed algorithm should have linear time complexity.
		
		Example :
		Input : mat[4][4] = { {10, 20, 30, 40},
		                      {15, 25, 35, 45},
		                      {27, 29, 37, 48},
		                      {32, 33, 39, 50}};
		              x = 29
		Output : true
		
		*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		
		System.out.println(searchIn2DMatrix(arr,x));
		

	}

	 public static boolean searchIn2DMatrix(int[][] matrix, int target) {
	        
	        int n = matrix.length;
	        int m =  matrix[0].length;
	        
	        int i = 0;
	        int j = m-1;
	        
			
			while(i>=0 && i<n  && j>=0 && j<m) {
				
				if(matrix[i][j] == target ) {
					return true;
				}else if(matrix[i][j]>target) {
					j--;
				}else {
					i++;
				}
				
			}
			return false;
	    }

}
