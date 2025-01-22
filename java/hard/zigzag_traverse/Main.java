package main.java.com.example.zigzagtraverse;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	// Main method to validate the functionality of the zigzagTraverse() method with various test cases.
	// O(t * n) time | O(t * n) space;
	// where t is the number of test cases and n is the total number of elements in the
	//	Two-Dimensional (2D) input array (list in this case)
	public static void main(String[] args) {
		// Test cases: (input 2D arrays) -> Expected output (zigzag traversal results)
		List<List<Integer>> testCase1 = Arrays.asList(
				Arrays.asList(1, 3, 4, 10),
				Arrays.asList(2, 5, 9, 11),
				Arrays.asList(6, 8, 12, 15),
				Arrays.asList(7, 13, 14, 16)
				);  // Test case 1 - Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
		List<List<Integer>> testCase2 = Arrays.asList(
				Arrays.asList(1)
				);  // Test case 2 - Expected: [1]
		List<List<Integer>> testCase3 = Arrays.asList(
				Arrays.asList(1, 2, 3, 4, 5)
				);  // Test case 3 - Expected: [1, 2, 3, 4, 5]
		List<List<Integer>> testCase4 = Arrays.asList(
				Arrays.asList(1),
				Arrays.asList(2),
				Arrays.asList(3),
				Arrays.asList(4),
				Arrays.asList(5)
				);  // Test case 4 - Expected: [1, 2, 3, 4, 5]
		List<List<Integer>> testCase5 = Arrays.asList(
				Arrays.asList(1, 3),
				Arrays.asList(2, 4),
				Arrays.asList(5, 7),
				Arrays.asList(6, 8),
				Arrays.asList(9, 10)
				);  // Test case 5 - Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		List<List<Integer>> testCase6 = Arrays.asList(
				Arrays.asList(1, 3, 4, 7, 8),
				Arrays.asList(2, 5, 6, 9, 10)
				);  // Test case 6 - Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		List<List<Integer>> testCase7 = Arrays.asList(
				Arrays.asList(1, 3, 4, 10, 11),
				Arrays.asList(2, 5, 9, 12, 19),
				Arrays.asList(6, 8, 13, 18, 20),
				Arrays.asList(7, 14, 17, 21, 24),
				Arrays.asList(15, 16, 22, 23, 25)
				);  // Test case 7 - Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
		List<List<Integer>> testCase8 = Arrays.asList(
				Arrays.asList(1, 3, 4, 10, 11, 20),
				Arrays.asList(2, 5, 9, 12, 19, 21),
				Arrays.asList(6, 8, 13, 18, 22, 27),
				Arrays.asList(7, 14, 17, 23, 26, 28),
				Arrays.asList(15, 16, 24, 25, 29, 30)
				);  // Test case 8 - Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
		List<List<Integer>> testCase9 = Arrays.asList(
				Arrays.asList(1, 3, 4, 10, 11),
				Arrays.asList(2, 5, 9, 12, 20),
				Arrays.asList(6, 8, 13, 19, 21),
				Arrays.asList(7, 14, 18, 22, 27),
				Arrays.asList(15, 17, 23, 26, 28),
				Arrays.asList(16, 24, 25, 29, 30)
				);  // Test case 9 - Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]
		List<List<Integer>> testCase10 = Arrays.asList(
				Arrays.asList(1, 21, -3, 4, 15, 6, -7, 88, 9),
				Arrays.asList(10, 11, 112, 12, 20, -1, -2, -3, -4),
				Arrays.asList(6, 8, 113, 19, 21, 0, 0, 0, 0),
				Arrays.asList(7, 2, 18, 22, -27, 12, 32, -111, 66),
				Arrays.asList(15, 17, 23, 226, 28, -28, -226, -23, -17),
				Arrays.asList(16, 24, 27, 299, 30, 29, 32, 31, 88)
				);  // Test case 10 - Expected: [1, 10, 21, -3, 11, 6, 7, 8, 112, 4, 15, 12, 113, 2, 15, 16, 17, 18, 19, 20, 6, -7, -1, 21, 22, 23, 24, 27, 226, -27, 0, -2, 88, 9, -3, 0, 12, 28, 299, 30, -28, 32, 0, -4, 0, -111, -226, 29, 32, -23, 66, -17, 31, 88]


		// List to store the test cases.
		List<List<List<Integer>>> testCases = new ArrayList<>();
		testCases.add(testCase1);
		testCases.add(testCase2);
		testCases.add(testCase3);
		testCases.add(testCase4);
		testCases.add(testCase5);
		testCases.add(testCase6);
		testCases.add(testCase7);
		testCases.add(testCase8);
		testCases.add(testCase9);
		testCases.add(testCase10);

		// Run each test case.
		for (int i = 0; i < testCases.size(); i++) {
			List<List<Integer>> array = testCases.get(i);
			List<Integer> result = ZigzagTraverse.zigzagTraverse(array);
			System.out.println("Test case " + (i + 1) + ": Array = " + array + " -> Result: " + result);
		}
	}
}