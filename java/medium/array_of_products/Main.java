package main.java.com.example.arrayofproducts;

import java.util.Arrays;

public class Main {

	// O(t * n) time | O(t * n) space;
	// where t is the number of test cases and n is the length of the input array
	public static void main(String[] args) {
		// Test cases: (array) -> Expected output (array of products)
		int[][] testCases = {
				{5, 1, 4, 2},                   // Test case 1 - Expected: [8, 40, 10, 20]
				{1, 8, 6, 2, 4},                // Test case 2 - Expected: [384, 48, 64, 192, 96]
				{-5, 2, -4, 14, -6},            // Test case 3 - Expected: [672, -1680, 840, -240, 560]
				{9, 3, 2, 1, 9, 5, 3, 2},       // Test case 4 - Expected: [1620, 4860, 7290, 14580, 1620, 2916, 4860, 7290]
				{4, 4},                         // Test case 5 - Expected: [4, 4]
				{0, 0, 0, 0},                   // Test case 6 - Expected: [0, 0, 0, 0]
				{1, 1, 1, 1},                   // Test case 7 - Expected: [1, 1, 1, 1]
				{-1, -1, -1},                   // Test case 8 - Expected: [1, 1, 1]
				{-1, -1, -1, -1},               // Test case 9 - Expected: [-1, -1, -1, -1]
				{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, // Test case 10 - Expected: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}  // Test case 11 - Expected: [362880, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		};

		// Run test cases.
		for (int i = 0; i < testCases.length; i++) {
			int[] array = testCases[i];
			int[] result = ArrayOfProducts.arrayOfProducts(array);
			System.out.println("Test case " + (i + 1) + ": array = " + Arrays.toString(array) + " -> Result: " + Arrays.toString(result));
		}
	}
}