package main.java.com.example.minimumwaitingtime;

import java.util.Arrays;

public class MinimumWaitingTime {
	// Function to find the minimum waiting time for all of the queries in an array.
	// O(nlog(n)) time | O(1) space, where n is the total number of queries
	public static int minimumWaitingTime(int[] queries) {
		// Sort the queries to minimize the waiting time.
		Arrays.sort(queries);

		int totalWaitingTime = 0;
		for(int idx = 0; idx < queries.length; idx++) {
			// Calculate how many queries are left after the current one.
			int queriesLeft = queries.length - (idx + 1);
			// Accumulate the waiting time contribution of the current query.
			totalWaitingTime += queries[idx] * queriesLeft;
		}

		return totalWaitingTime;
	}
}