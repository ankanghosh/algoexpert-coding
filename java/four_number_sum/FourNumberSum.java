package main.java.com.example.fournumbersum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

// Average: O(n^2) time | O(n^2) space
// Worst: O(n^3) time | O(n^2) space
public class FourNumberSum {

	public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
		// List to store the resulting quadruplets
		List<Integer[]> quadruplets = new ArrayList<>();
		// HashMap to store pairs of numbers and their sums
		Map<Integer, List<Integer[]>> allPairSums = new HashMap<>();

		// Iterate over the array starting from the second element to the second last element
		for (int i = 1; i < array.length - 1; i++) {
			// Iterate over the elements to the right of the current element
			for (int j = i + 1; j < array.length; j++) {
				int currentSum = array[i] + array[j];  // Calculate the sum of the current pair
				int difference = targetSum - currentSum;  // Calculate the difference required to reach the targetSum

				// If the difference is in the HashMap, it means we have found some pairs that can form quadruplets
				if (allPairSums.containsKey(difference)) {
					for (Integer[] pair : allPairSums.get(difference)) {
						// Create a new quadruplet with the existing pair and the current pair
						Integer[] newQuadruplet = {pair[0], pair[1], array[i], array[j]};
						// Add the new quadruplet to the result list
						quadruplets.add(newQuadruplet);
					}
				}
			}

			// Iterate over the elements to the left of the current element
			for (int k = 0; k < i; k++) {
				int currentSum = array[i] + array[k];  // Calculate the sum of the current pair
				Integer[] pair = {array[k], array[i]};  // Create the pair

				// Store the pair sum and the pair itself in the HashMap
				if (!allPairSums.containsKey(currentSum)) {
					List<Integer[]> pairs = new ArrayList<>();
					pairs.add(pair);
					allPairSums.put(currentSum, pairs);
				} else {
					allPairSums.get(currentSum).add(pair);
				}
			}
		}
		return quadruplets;  // Return the list of all quadruplets found
	}
}