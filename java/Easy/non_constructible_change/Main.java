package main.java.com.example.nonconstructiblechange;

public class Main {

	// O(t * nlogn) time | O(t * n) space;
	// where t is the number of test cases and n is the number of coins
	public static void main(String[] args) {
		// Test cases: (array) -> Expected output (minimum amount of change that cannot
		// be created)
		int[][] testCases = {{5, 7, 1, 1, 2, 3, 22}, // Test case 1: 20
				{1, 1, 1, 1, 1}, // Test case 2: 6
				{1, 5, 1, 1, 1, 10, 15, 20, 100}, // Test case 3: 55
				{6, 4, 5, 1, 1, 8, 9}, // Test case 4: 3
				{}, // Test case 5: 1
				{87}, // Test case 6: 1
				{5, 6, 1, 1, 2, 3, 4, 9}, // Test case 7: 32
				{5, 6, 1, 1, 2, 3, 43}, // Test case 8: 19
				{1, 1}, // Test case 9: 3
				{2}, // Test case 10: 1
				{1}, // Test case 11: 2
				{109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4}, // Test case 12: 87
				{1, 2, 3, 4, 5, 6, 7}, // Test case 13: 29
		};

		// Run test cases
		for (int i = 0; i < testCases.length; i++) {
			int result = NonConstructibleChange.nonConstructibleChange(testCases[i]);
			System.out.println(
					"Test case " + (i + 1) + ": Coins = " + arrayToString(testCases[i]) + " -> Result: " + result);
		}
	}

	// Helper method to convert array to string for printing
	private static String arrayToString(int[] array) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i < array.length - 1)
				sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
}