package main.java.com.example.fournumbersum;

import java.util.List;

// Average: O(t*n^2) time | O(n^2) space
// Worst: O(t*n^3) time | O(t*n^2) space
public class Main {

    public static void main(String[] args) {
        // Define test cases and their corresponding target sums
        int[][] testCases = {
            {7, 6, 4, -1, 1, 2},    // Test case 1: Expected: [[7, 6, 4, -1], [7, 6, 1, 2]]
            {1, 2, 3, 4, 5, 6, 7},    // Test case 2: Expected: [[1, 2, 3, 4]]
            {5, -5, -2, 2, 3, -3},    // Test case 3: Expected: [[5, -5, -2, 2], [5, -5, 3, -3], [-2, 2, 3, -3]]
            {-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9},    // Test case 4: Expected: [[-2, -1, 1, 6], [-2, 1, 2, 3], [-2, -1, 2, 5], [-2, -1, 3, 4]]
            {-1, 22, 18, 4, 7, 11, 2, -5, -3},    // Test case 5: Expected: [[-1, 22, 7, 2], [22, 4, 7, -3], [-1, 18, 11, 2], [18, 4, 11, -3], [22, 11, 2, -5]]
            {-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5},    // Test case 6: Expected: [[-5, 2, 15, 8], [-3, 2, -7, 28], [-10, -3, 28, 5], [-10, 28, -6, 8], [-7, 28, -6, 5], [-5, 2, 12, 11], [-5, 12, 8, 5]]
            {1, 2, 3, 4, 5},    // Test case 7: Expected: []
            {1, 2, 3, 4, 5, -5, 6, -6}    // Test case 8: Expected: [[2, 3, 5, -5], [1, 4, 5, -5], [2, 4, 5, -6], [1, 3, -5, 6], [2, 3, 6, -6], [1, 4, 6, -6]]
        };

        int[] targetSums = {16, 10, 0, 4, 30, 20, 100, 5};    // Corresponding target sums

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
            // Call the fourNumberSum method and get the result
            List<Integer[]> result = FourNumberSum.fourNumberSum(array, targetSum);
            // Print the result for the current test case
            printTestCaseResult(i + 1, array, targetSum, result);
        }
    }

    /**
     * Prints the result of a single test case.
     *
     * @param testCaseNumber The number of the test case.
     * @param array The input array.
     * @param targetSum The target sum to achieve with four numbers.
     * @param result The list of quadruplets that sum to the target.
     */
    private static void printTestCaseResult(int testCaseNumber, int[] array, int targetSum, List<Integer[]> result) {
        // Print the details of the test case
        System.out.print("Test case " + testCaseNumber + ": Array = [");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + (j < array.length - 1 ? ", " : ""));
        }
        System.out.println("], Target Sum = " + targetSum + " -> Result: " + formatResult(result));
    }

    /**
     * Helper function to format the result for printing.
     *
     * @param result List of quadruplets that sum to the target.
     * @return A formatted string representation of the quadruplets.
     */
    private static String formatResult(List<Integer[]> result) {
        if (result.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < result.size(); i++) {
            sb.append("[");
            Integer[] quadruplet = result.get(i);
            for (int j = 0; j < quadruplet.length; j++) {
                sb.append(quadruplet[j]);
                if (j < quadruplet.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            if (i < result.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}