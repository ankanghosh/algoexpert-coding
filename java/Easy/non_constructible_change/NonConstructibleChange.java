package main.java.com.example.nonconstructiblechange;

import java.util.Arrays;

public class NonConstructibleChange {
	// O(nlogn) time | O(1) space, where n is the number of coins
	public static int nonConstructibleChange(int[] coins) {
		// Check if the coins array is empty
		if (coins.length == 0) {
			// If there are no coins, the minimum non-constructible change is 1
			return 1;
		}

		// Sort the coins array in ascending order
		Arrays.sort(coins);

		// Track the maximum amount of change we can create
		int currentChangeCreated = 0;

		// Loop through each coin
		for (int coin : coins) {
			// If the current coin is greater than currentChangeCreated + 1, then we cannot
			// make currentChangeCreated + 1
			if (coin > currentChangeCreated + 1) {
				return currentChangeCreated + 1;
			}
			// Add the current coin to the total amount of change we can create
			currentChangeCreated += coin;
		}

	    // If all of the coins are processed, return the next non-constructible change
		return currentChangeCreated + 1;
	}
}