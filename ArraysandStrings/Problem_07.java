/**
 * Problem Statement :
 * 
 * Given an image represented by an N X N matrix, where
 * each pixel in the image is 4 bytes, write a method to
 * rotate the image by 90 degrees. Can you do this in place.
 * 
 * Time Complexity : O(n^2)
 * Space Complexity : O(1)
 */
 
 public class Problem_07 {
	 public static int[][] rotateMatrixInPlace(int[][] matrix) {
		 final int M = matrix.length;
		 final int N =matrix[0].length;
		 int len = matrix.length;
		 if(matrix==null || M!=N) return null;
		 for(int row=0;row<matrix.length/2;i++){
			 for(int col = row;col<matrix.length-1-row;col++){
				 int temp = matrix[row][col];
				 matrix[row][col] = matrix[len-1-col][row];
				 matrix[len-1-row][row] = matrix[len-1-row][len-1-col];
				 matrix[len-1-row][len-1-col] = matrix[col][len-1-row];
				 matrix[col][len-1-row]=temp;
			 }
		 }
	 }
 }