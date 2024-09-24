package main.java.com.example.monotonicarray;

public class MonotonicArray {

	// O(n) time | O(1) space, where n is the length of the array
	public static boolean isMonotonic(int[] array) {
	    // Initialize two boolean variables to track whether the array is
	    // non-increasing or non-decreasing. Initially, assume the array could be either.
	    boolean isNonIncreasing = true;
	    boolean isNonDecreasing = true;

	    // Iterate through the array from the first element to the second-to-last element.
	    // Compare each of the elements of the array with the next one to determine the monotonicity.
	    for (int i = 0; i < array.length - 1; i++) {
	        // If the current element is greater than the next one, the array is not non-decreasing.
	        if (array[i + 1] < array[i]) {
	        	isNonDecreasing = false;
	        }
	        // If the current element is less than the next one, the array is not non-increasing.
	        else if (array[i + 1] > array[i]) {
	        	isNonIncreasing = false;
	        }
	    }

	    // Return true if the array is either non-increasing or non-decreasing.
	    // If neither condition holds, return false.
	    return isNonIncreasing || isNonDecreasing;
	}
}