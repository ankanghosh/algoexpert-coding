package main.java.com.example.largestrange;

import java.util.Arrays;

public class Main {

	// O(t * n) time | O(t * n) space;
	// where t is the number of test cases and n is the number of elements in the array
	public static void main(String[] args) {
		// Test cases: (array) -> Expected output (largest range of integers contained in the array)
		int[][] testCases = {
				{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6},         // Test case 1 - Expected: [0, 7]
				{1},                                              // Test case 2 - Expected: [1, 1]
				{1, 2},                                           // Test case 3 - Expected: [1, 2]
				{4, 2, 1, 3},                                     // Test case 4 - Expected: [1, 4]
				{4, 2, 1, 3, 6},                                  // Test case 5 - Expected: [1, 4]
				{8, 4, 2, 10, 3, 6, 7, 9, 1},                     // Test case 6 - Expected: [6, 10]
				{19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14},  // Test case 7 - Expected: [10, 19]
				{0, 9, 19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14},  // Test case 8 - Expected: [-1, 19]
				{0, -5, 9, 19, -1, 18, 17, 2, -4, -3, 10, 3, 12, 5, 16, 4, 11, 7, -6, -7, 6, 15, 12, 12, 2, 1, 6, 13, 14, -2},  // Test case 9 - Expected: [-7, 7]
				{-7, -7, -7, -7, 8, -8, 0, 9, 19, -1, -3, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, -6, 8, 7, 6, 15, 12, 12, -5, 2, 1, 6, 13, 14, -4, -2},  // Test case 10 - Expected: [-8, 19]
				{1, 1, 1, 3, 4},                                  // Test case 11 - Expected: [3, 4]
				{-1, 0, 1},                                       // Test case 12 - Expected: [-1, 1]
				{10, 0, 1}                                        // Test case 13 - Expected: [0, 1]
		};

		// Run test cases
		for (int i = 0; i < testCases.length; i++) {
			int[] array = testCases[i];
			int[] result = LargestRange.largestRange(array);
			System.out.println("Test case " + (i + 1) + ": array = " + Arrays.toString(array) + " -> Result: " + Arrays.toString(result));
		}
	}
}