package main.java.com.example.threenumbersum;

import java.util.List;

// O(t*n^2) time | O(t*n) space; t is the number of test cases
public class Main {

    public static void main(String[] args) {
        // Define test cases and their corresponding target sums
        int[][] testCases = {
                {12, 2, 1, 3, -6, 5, -8, 6},  // Test case 1: Expected: [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
                {1, 2, -2, -1, 0},            // Test case 2: Expected: [[-2, 0, 2], [-1, 0, 1]]
                {0, 0, 0, 0},                 // Test case 3: Expected: [[0, 0, 0], [0, 0, 0]]
                {-2, -1, -1, 0, 1, 2, 3},    // Test case 4: Expected: [[-2, -1, 3], [-2, 0, 2], [-1, -1, 2], [-1, 0, 1]]
                {-5, -2, 0, 1, 2, 3, 4},     // Test case 5: Expected: [[-2, 1, 4], [-2, 2, 3], [0, 1, 2]]
                {1, 2, 3, 4, 5, 6},          // Test case 6: Expected: [[1, 4, 5], [1, 3, 6], [2, 3, 5]]
                {-3, -2, -1, 2, 4, 7},       // Test case 7: Expected: [[-3, -1, 7], [-3, 2, 4]]
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, // Test case 8: Expected: [[1, 4, 10], [1, 5, 9], [1, 6, 8], [2, 3, 10], [2, 4, 9], [2, 5, 8], [2, 6, 7], [3, 4, 8], [3, 5, 7], [4, 5, 6]]
                {1, 1, 1, 1, 1, 1},          // Test case 9: Expected: [[1, 1, 1], [1, 1, 1], [1, 1, 1], [1, 1, 1], [1, 1, 1], [1, 1, 1]]
                {-10, -5, -2, 0, 2, 5, 10}   // Test case 10: Expected: [[-10, 0, 10], [-5, 0, 5], [-2, 0, 2]]
            };

        int[] targetSums = {
                0,  // Test case 1
                0,  // Test case 2
                0,  // Test case 3
                0,  // Test case 4
                3,  // Test case 5
                10, // Test case 6
                3,  // Test case 7
                15, // Test case 8
                3,  // Test case 9
                0   // Test case 10
            };

        // Run test cases and print results
        runTestCases(testCases, targetSums);
    }

    /**
     * Executes test cases and prints the results.
     *
     * @param testCases 2D array containing test cases with arrays to test.
     * @param targetSums Array of target sums corresponding to each test case.
     */
    private static void runTestCases(int[][] testCases, int[] targetSums) {
        // Iterate over each test case
        for (int i = 0; i < testCases.length; i++) {
            int[] array = testCases[i];
            int targetSum = targetSums[i];
            // Call the twoNumberSum method and get the result
            List<List<Integer>> result = ThreeNumberSum.threeNumberSum(array, targetSum);
            // Print the result for the current test case
            printTestCaseResult(i + 1, array, targetSum, result);
        }
    }

    /**
     * Prints the details of a test case including the array, target sum, and result.
     *
     * @param testCaseNumber The number identifying the test case.
     * @param array The input array of integers used in the test case.
     * @param targetSum The target sum for finding triplets.
     * @param result The list of triplets that sum up to the targetSum.
     */
    private static void printTestCaseResult(int testCaseNumber, int[] array, int targetSum, List<List<Integer>> result) {
        // Print the details of the test case
        System.out.print("Test case " + testCaseNumber + ": Array = [");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + (j < array.length - 1 ? ", " : ""));
        }
        System.out.println("], Target Sum = " + targetSum + " -> Result: " +
            formatResult(result));
    }

    /**
     * Formats the result list for printing.
     *
     * @param result The list of triplets to be formatted.
     * @return A string representation of the result list.
     */
    private static String formatResult(List<List<Integer>> result) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i).toString());
            if (i < result.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}