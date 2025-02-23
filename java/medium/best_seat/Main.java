package main.java.com.example.bestseat;

import java.util.Arrays;

public class Main {

	// O(t * n) time | O(t) space;
	// where t is the number of test cases and n is the total number of seats in a row
	public static void main(String[] args) {
		// Test cases: (seats) -> Expected output (best seat index)
		int[][] testCases = {
				{1},  // Test case 1 - Expected: -1
				{1, 0, 1, 0, 0, 0, 1},  // Test case 2 - Expected: 4
				{1, 0, 1},  // Test case 3 - Expected: 1
				{1, 0, 0, 1},  // Test case 4 - Expected: 1
				{1, 1, 1},  // Test case 5 - Expected: -1
				{1, 0, 0, 1, 0, 0, 1},  // Test case 6 - Expected: 1
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},  // Test case 7 - Expected: 3
				{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},  // Test case 8 - Expected: 4
				{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},  // Test case 9 - Expected: 4
				{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},  // Test case 10 - Expected: 13
				{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},  // Test case 11 - Expected: 13
				{1, 0, 0, 0, 1, 0, 0, 0, 0, 1},  // Test case 12 - Expected: 6
				{1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1},  // Test case 13 - Expected: 3
				{1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1}  // Test case 14 - Expected: 5
		};

		// Run test cases.
		for (int i = 0; i < testCases.length; i++) {
			int[] seats = testCases[i];
			int result = BestSeat.bestSeat(seats);
			System.out.println("Test case " + (i + 1) + ": seats = " + Arrays.toString(seats) + " -> Result: " + result);
		}
	}
}