package main.java.com.example.twonumbersum;

// O(t*n) time | O(t*n) space; t is the number of test cases
public class Main {

    public static void main(String[] args) {
        // Define test cases and their corresponding target sums
        int[][] testCases = {
            {3, 5, -4, 8, 11, 1, -1, 6},  // Expected: [11, -1]
            {2, 7, 11, 15},                // Expected: [2, 7]
            {0, 2, 3, 4},                  // Expected: [2, 3]
            {3, 2, 4},                     // Expected: [2, 4]
            {1, 2, 3},                     // Expected: []
            {3, 3},                        // Expected: [3, 3]
            {1, 2, 3, 4, 5},              // Expected: []
            {5, -2, 8, -3, 7}             // Expected: [8, -3]
        };

        int[] targetSums = {10, 9, 5, 6, 7, 6, 10, 5}; // Target sums

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
            int[] result = TwoNumberSum.twoNumberSum(array, targetSum);
            // Print the result for the current test case
            printTestCaseResult(i + 1, array, targetSum, result);
        }
    }

    /**
     * Prints the result of a test case.
     *
     * @param testCaseNumber The number of the test case.
     * @param array The array used in the test case.
     * @param targetSum The target sum for the test case.
     * @param result The result returned by the twoNumberSum method.
     */
    private static void printTestCaseResult(int testCaseNumber, int[] array, int targetSum, int[] result) {
        // Print the details of the test case
        System.out.print("Test case " + testCaseNumber + ": Array = [");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + (j < array.length - 1 ? ", " : ""));
        }
        System.out.println("], Target Sum = " + targetSum + " -> Result: " +
            (result.length > 0 ? "[" + result[0] + ", " + result[1] + "]" : "[]"));
    }
}