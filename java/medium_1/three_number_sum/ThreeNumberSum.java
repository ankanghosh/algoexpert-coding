package main.java.com.example.threenumbersum;

//O(n^2) time | O(n) space
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeNumberSum {
	/**
	 * Finds all unique triplets in the array that sum up to the targetSum.
	 *
	 * @param array The input array of integers.
	 * @param targetSum The target sum for the triplets.
	 * @return A list of lists, where each inner list contains a triplet of integers that add up to the targetSum.
	 */
	public static List<List<Integer>> threeNumberSum(int[] array, int targetSum) {
		// Sort the array to enable the two-pointer technique.
		Arrays.sort(array);

		// Initialize the list to store the triplets.
		List<List<Integer>> triplets = new ArrayList<>();

		// Iterate through the array to fix the first element of the triplet.
		for(int i = 0; i < array.length - 2; i++) {
			int left = i + 1;  // Initialize the left pointer.
			int right = array.length - 1;  // Initialize the right pointer.

			// Use the two-pointer technique to find pairs that, along with array[i], sum up to targetSum.
			while (left < right) {
				// Calculate the current sum of the triplet.
				int currentSum = array[i] + array[left] + array[right];

				if (currentSum == targetSum) {
					// If the sum matches the target, add the triplet to the list.
					triplets.add(Arrays.asList(array[i], array[left], array[right]));

					// Move both pointers to find new potential triplets.
					right--;
					left++;
				} else if (currentSum < targetSum)
					// If the sum is less than the target, move the left pointer to increase the sum.
					left++;
				  else
					// If the sum is greater than the target, move the right pointer to decrease the sum.
					right--;
			}
		}

		// Return the list of triplets.
		return triplets;
	}
}