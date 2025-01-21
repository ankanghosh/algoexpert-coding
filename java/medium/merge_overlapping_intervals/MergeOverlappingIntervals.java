package main.java.com.example.mergeoverlappingintervals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MergeOverlappingIntervals {
	// Method to return the list of merged intervals by merging any overlapping intervals in an array.
	// O(nlog(n)) time | O(n) space, where n is the length of the input array
	public static int[][] mergeOverlappingIntervals(int[][] intervals) {
		// Sort the intervals based on the starting value.
		int[][] sortedIntervals = intervals.clone();
		Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

		// Initialize a list to store merged intervals.
		List<int[]> mergedIntervals = new ArrayList<>();

		// Initialize with the first interval.
		int[] currentInterval = sortedIntervals[0];
		// Add the first interval to the merged list.
		mergedIntervals.add(currentInterval);

		// Start the loop from the second element (index 1).
		for (int i = 1; i < sortedIntervals.length; i++) {
			// Get the next interval.
			int[] nextInterval = sortedIntervals[i];
			// Get the end of the current interval.
			int currentIntervalEnd = currentInterval[1];
			// Get the start of the next interval.
			int nextIntervalStart = nextInterval[0];
			// Get the end of the next interval.
			int nextIntervalEnd = nextInterval[1];

			// Check if the intervals overlap.
			if (currentIntervalEnd >= nextIntervalStart) {
				// Merge the intervals.
				currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
			}
			else {
				// No overlap, update the current interval as the next interval and add it to the merged list.
				currentInterval = nextInterval;
				mergedIntervals.add(currentInterval);
			}
		}

		// Return the merged intervals list converted to a 2D array.
		return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
	}
}