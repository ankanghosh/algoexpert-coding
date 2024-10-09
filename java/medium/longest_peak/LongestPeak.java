package main.java.com.example.longestpeak;

public class LongestPeak {
	// O(n) time | O(1) space, where n is the length of the input array
	public static int longestPeak(int[] array) {
		// Keep track of the longest peak length found so far
		int longestPeakLength = 0;
		// Start iterating from the second element to compare with its neighbors
		int i = 1;

		// Loop until the second last element since the last element cannot form a peak
		while (i < array.length - 1) {
			// Check if the current element forms a peak by comparing it to its neighbors
			boolean isPeak = array[i - 1] < array[i] && array[i] > array[i + 1];

			// If it is not a peak, move to the next element and continue
			if (!isPeak) {
				i++;
				continue;
			}

			// If it is a peak, expand leftwards to find the start of the strictly increasing part
			int leftIdx = i - 2;
			while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) {
				leftIdx--;
			}

			// Expand rightwards to find the end of the strictly decreasing part
			int rightIdx = i + 2;
			while (rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]) {
				rightIdx++;
			}

			// Calculate the length of the current peak
			int currentPeakLength = rightIdx - leftIdx - 1;

			// Update the longest peak length if the current peak is longer
			longestPeakLength = Math.max(longestPeakLength, currentPeakLength);

			// Move `i` to the end of the current peak, as the elements after the tip will not form another one
			i = rightIdx;
		}

		// Return the length of the longest peak found
		return longestPeakLength;
	}
}