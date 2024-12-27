package main.java.com.example.minrewards;

public class Main {

	// O(t * n) time | O(t * n) space;
	// where t is the number of test cases and n is the length of the input array
	public static void main(String[] args) {
		// Test cases: (array) -> Expected output (minimum number of rewards to be given out to students based on their scores in an array)
        int[][] testCases = {
                {8, 4, 2, 1, 3, 6, 7, 9, 5}, // Test case 1 - Expected: 25
                {1}, // Test case 2 - Expected: 1
                {5, 10}, // Test case 3 - Expected: 3
                {10, 5}, // Test case 4 - Expected: 3
                {4, 2, 1, 3}, // Test case 5 - Expected: 8
                {0, 4, 2, 1, 3}, // Test case 6 - Expected: 9
                {2, 20, 13, 12, 11, 8, 4, 3, 1, 5, 6, 7, 9, 0}, // Test case 7 - Expected: 52
                {2, 1, 4, 3, 6, 5, 8, 7, 10, 9}, // Test case 8 - Expected: 15
                {800, 400, 20, 10, 30, 61, 70, 90, 17, 21, 22, 13, 12, 11, 8, 4, 2, 1, 3, 6, 7, 9, 0, 68, 55, 67, 57, 60, 51, 661, 50, 65, 53} // Test case 9 - Expected: 93
            };

            // Run test cases.
            for (int i = 0; i < testCases.length; i++) {
                int[] scores = testCases[i];
                int result = MinRewards.minRewards(scores);
                System.out.println("Test case " + (i + 1) + ": scores = " + java.util.Arrays.toString(scores) + " -> Result: " + result);
            }
	}
}