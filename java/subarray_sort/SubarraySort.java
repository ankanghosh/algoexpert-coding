package main.java.com.example.subarraysort;

// O(n) time | O(1) space, where n is the length of the array.
public class SubarraySort {

	// Method to find the smallest subarray that needs to be sorted to make the entire array sorted.
	public static int[] subarraySort(int[] array) {
		// Initialize variables to track the minimum and maximum out-of-order elements.
		int minOutOfOrder = Integer.MAX_VALUE;
		int maxOutOfOrder = Integer.MIN_VALUE;

		// Iterate through the array to find the out-of-order elements.
		for (int i = 0; i < array.length; i++) {
			int num = array[i];
			// Check if the current element is out of order.
			if (isOutOfOrder(i, num, array)) {
				// Update the minimum and maximum out-of-order values.
				minOutOfOrder = Math.min(minOutOfOrder, num);
				maxOutOfOrder = Math.max(maxOutOfOrder, num);
			}
		}

		// If no elements are out of order, the array is already sorted.
		if (minOutOfOrder == Integer.MAX_VALUE) {
			return new int[] {-1, -1};
		}

		// Find the left index of the subarray to be sorted.
		int subArrayLeftIdx = 0;
	    // Increment the left index until we find where the minOutOfOrder value belongs.
		while (minOutOfOrder >= array[subArrayLeftIdx]) {
			subArrayLeftIdx++;
		}

		// Find the right index of the subarray to be sorted.
		int subArrayRightIdx = array.length - 1;
	    // Decrement the right index until we find where the maxOutOfOrder value belongs.
		while (maxOutOfOrder <= array[subArrayRightIdx]) {
			subArrayRightIdx--;
		}

		// Return the starting and ending indices of the smallest subarray that needs to be sorted.
		return new int[] {subArrayLeftIdx, subArrayRightIdx};
	}

	// Method to check if an element at index i is out of order in the array.
	public static boolean isOutOfOrder(int i, int num, int[] array) {
		// Check if the element is the first in the array.
		if (i == 0) {
			// First element is out of order if it is greater than the next element.
			return num > array[i + 1];
		}
		// Check if the element is the last in the array.
		else if (i == array.length - 1) {
			// Last element is out of order if it is less than the previous element.
			return num < array[i - 1];
		}
	    // For each of the other elements, check if it is smaller than the previous element
	    // or greater than the next element, indicating it is out of order.
		else {
			return num < array[i - 1] || num > array[i + 1];
		}
	}
}