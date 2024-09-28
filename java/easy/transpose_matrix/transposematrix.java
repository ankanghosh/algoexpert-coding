package main.java.com.example.transposematrix;

public class TransposeMatrix {
	// O(w * h) time | O(w * h) space, where w is the width
	// of the matrix and h is the height
	public static int[][] transposeMatrix(int[][] matrix) {
		// Create a new matrix with dimensions swapped (rows become columns, and columns become rows)
		int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

		// Iterate over each column of the original matrix (this will become the rows of the transposed matrix)
		for (int col = 0; col < matrix[0].length; col++) {
			// For each column, iterate over each row of the original matrix (this will become the columns of the transposed matrix)	    
			for (int row = 0; row < matrix.length; row++) {
				// Assign the value at matrix[row][col] in the original matrix to the corresponding position in the transposed matrix
				transposedMatrix[col][row] = matrix[row][col];
			}
		}
		// Return the transposed matrix
		return transposedMatrix;
	}
}