package main.java.com.example.zigzagtraverse;

import java.util.List;
import java.util.ArrayList;

public class ZigzagTraverse {
	// Method to return the result of zigzag traversal in a Two-Dimensional (2D) array (list in this case).
	// O(n) time | O(n) space, where n is the total number of elements in the 2D input array (list in this case)
	public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
		// Calculate the height (last row index) of the array.
		int height = array.size() - 1;
		// Calculate the width (last column index) of the array.
		int width = array.get(0).size() - 1;
		// Initialize the result list to store the traversal.
		List<Integer> result = new ArrayList<Integer>();
		// Start from the top-left corner.
		int row = 0;
		int col = 0;
		// Flag to determine the direction of traversal.
		boolean goingDown = true;

		// Continue traversal until the indices go out of bounds.
		while (!isOutOfBounds(row, col, height, width)) {
			// Add the current element to the result list.
			result.add(array.get(row).get(col));

			// If the current direction is downward.
			if (goingDown) {
				// Check if we hit the bottom row or the first column.
				if (col == 0 || row == height) {
					// Change the direction to upward.
					goingDown = false;
					// Move right if at the bottom row, otherwise move down.
					if (row == height) {
						col += 1;
					} else {
						row += 1;
					}
				} else {
					// Otherwise, move diagonally down-left.
					row += 1;
					col -= 1;
				}
			} 
			// If the current direction is upward.
			else {
				// Check if we hit the top row or the last column.
				if (row == 0 || col == width) {
					// Change the direction to downward.
					goingDown = true;
					// Move down if at the last column, otherwise move right.
					if (col == width) {
						row += 1;
					} else {
						col += 1;
					}
				} else {
					// Otherwise, move diagonally up-right.
					row -= 1;
					col += 1;
				}
			}
		}

		// Return the zigzag traversal result.
		return result;
	}

	// Helper function to check if the indices are out of bounds.
	public static boolean isOutOfBounds(int row, int col, int height, int width) {
		return row < 0 || row > height || col < 0 || col > width;
	}
}