package main.java.com.example.longestpeak;

import java.util.Arrays;

public class Main {

	// O(t * n) time | O(t) space;
	// where t is the number of test cases and n is the length of the input array
	public static void main(String[] args) {
		// Test cases: (array) -> Expected output (longest peak length in the array)
		int[][] testCases = {
				{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3},     // Test case 1 - Expected: 6
				{},                                             // Test case 2 - Expected: 0
				{1, 3, 2},                                      // Test case 3 - Expected: 3
				{1, 2, 3, 4, 5, 1},                             // Test case 4 - Expected: 6
				{5, 4, 3, 2, 1, 2, 1},                          // Test case 5 - Expected: 3
				{5, 4, 3, 2, 1, 2, 10, 12, -3, 5, 6, 7, 10},    // Test case 6 - Expected: 5
				{5, 4, 3, 2, 1, 2, 10, 12},                     // Test case 7 - Expected: 0
				{1, 2, 3, 4, 5, 6, 10, 100, 1000},              // Test case 8 - Expected: 0
				{1, 2, 3, 3, 2, 1},                             // Test case 9 - Expected: 0
				{1, 1, 3, 2, 1},                                // Test case 10 - Expected: 4
				{1, 2, 3, 2, 1, 1},                             // Test case 11 - Expected: 5
				{1, 1, 1, 2, 3, 10, 12, -3, -3, 2, 3, 45, 800, 99, 98, 0, -1, -1, 2, 3, 4, 5, 0, -1, -1},  // Test case 12 - Expected: 9
				{1, 2, 3, 3, 4, 0, 10}                          // Test case 13 - Expected: 3
		};

		// Run test cases
		for (int i = 0; i < testCases.length; i++) {
			int[] array = testCases[i];
			int result = LongestPeak.longestPeak(array);
			System.out.println("Test case " + (i + 1) + ": array = " + Arrays.toString(array) + " -> Result: " + result);
		}
	}
}