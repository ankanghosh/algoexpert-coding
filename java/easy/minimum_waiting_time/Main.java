package main.java.com.example.minimumwaitingtime;

import java.util.Arrays;

public class Main {

	// O(t * nlog(n)) time | O(t) space;
	// where t is the number of test cases and n is the total number of queries
	public static void main(String[] args) {
		// Test cases: (queries) -> Expected output
		int[][] testCases = {
				{3, 2, 1, 2, 6},  // Test case 1 - Expected: 17
				{2, 1, 1, 1},  // Test case 2 - Expected: 6
				{1, 2, 4, 5, 2, 1},  // Test case 3 - Expected: 23
				{25, 30, 2, 1},  // Test case 4 - Expected: 32
				{1, 1, 1, 1, 1},  // Test case 5 - Expected: 10
				{7, 9, 2, 3},  // Test case 6 - Expected: 19
				{4, 3, 1, 1, 3, 2, 1, 8},  // Test case 7 - Expected: 45
				{2},  // Test case 8 - Expected: 0
				{7},  // Test case 9 - Expected: 0
				{8, 9},  // Test case 10 - Expected: 8
				{1, 9},  // Test case 11 - Expected: 1
				{5, 4, 3, 2, 1},  // Test case 12 - Expected: 20
				{1, 2, 3, 4, 5},  // Test case 13 - Expected: 20
				{1, 1, 1, 4, 5, 6, 8, 1, 1, 2, 1},  // Test case 14 - Expected: 81
				{17, 4, 3}  // Test case 15 - Expected: 10
		};

		// Run test cases.
		for (int i = 0; i < testCases.length; i++) {
			int[] queries = Arrays.copyOf(testCases[i], testCases[i].length); // Copy to preserve the original array.
			int result = MinimumWaitingTime.minimumWaitingTime(queries);
			System.out.println("Test case " + (i + 1) + ": queries = " + Arrays.toString(testCases[i]) + " -> Result: " + result);
		}
	}
}