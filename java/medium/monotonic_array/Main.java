package main.java.com.example.monotonicarray;

public class Main {

	// O(t * n) time | O(t) space;
	// where t is the number of test cases and n is the length of the array
	public static void main(String[] args) {
		// Test cases: (array) -> Expected output (true / false if the array is monotonic)
		int[][] testCases = {
				{-1, -5, -10, -1100, -1100, -1101, -1102, -9001},  // Test case 1: true
				{1, 2, 3, 4, 5},  // Test case 2: true
				{5, 4, 3, 2, 1},  // Test case 3: true
				{10, 20, 20, 30, 40},  // Test case 4: true
				{1, 2, 2, 3, 4, 5},  // Test case 5: true
				{100, 100, 100},  // Test case 6: true
				{1, 3, 2, 4},  // Test case 7: false
				{7, 5, 8, 6},  // Test case 8: false
				{10, 20, 30, 20},  // Test case 9: false
				{5, 3, 4, 2}   // Test case 10: false
		};

		// Run test cases
		for (int i = 0; i < testCases.length; i++) {
			boolean result = MonotonicArray.isMonotonic(testCases[i]);
			System.out.println("Test case " + (i + 1) + ": Array = " + arrayToString(testCases[i]) + " -> Result: " + result);
		}
	}

	// Helper method to convert array to string for printing
	private static String arrayToString(int[] array) {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i < array.length - 1) sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
}