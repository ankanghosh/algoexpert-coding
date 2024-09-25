package main.java.com.example.spiraltraverse;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
	// O(n) time | O(n) space, where n is the total number of elements in the two-dimensional array
	public static List<Integer> spiralTraverse(int[][] array) {
		// Check if the input array is empty; if so, return an empty list
		if(array.length == 0) {
			return new ArrayList<Integer>();
		}

		// Initialize a list to store the result of the spiral traversal
		List<Integer> result = new ArrayList<Integer>();

		// Define the starting and ending row and column indices
		int startRow = 0;                   // Starting row index
		int endRow = array.length - 1;      // Ending row index (last row)
		int startCol = 0;                   // Starting column index
		int endCol = array[0].length - 1;   // Ending column index (last column)

		// Continue until all rows and columns are traversed
		while(startRow <= endRow && startCol <= endCol) {
			// Traverse from left to right along the current startRow
			for (int col = startCol; col <= endCol; col++) {
				result.add(array[startRow][col]);  // Add each element to the result
			}

			// Traverse from top to bottom along the current endCol
			for (int row = startRow + 1; row <= endRow; row++) {
				result.add(array[row][endCol]);  // Add each element to the result
			}

			// Traverse from right to left along the current endRow, if there is still a row to process
			for (int col = endCol - 1; col >= startCol; col--) {
				// Break if there is only one row left to prevent duplication
				if(startRow == endRow) {
					break;
				}
				result.add(array[endRow][col]);  // Add each element to the result
			}

			// Traverse from bottom to top along the current startCol, if there is still a column to process
			for (int row = endRow - 1; row > startRow; row--) {
				// Break if there is only one column left to prevent duplication
				if(startCol == endCol) {
					break;
				}
				result.add(array[row][startCol]);  // Add each element to the result
			}

			// Move the boundaries inward for the next layer of the spiral
			startRow++;  // Move the startRow down
			endRow--;    // Move the endRow up
			startCol++;  // Move the startCol right
			endCol--;    // Move the endCol left
		}

		// Return the result containing the elements in spiral order
		return result;
	}
}