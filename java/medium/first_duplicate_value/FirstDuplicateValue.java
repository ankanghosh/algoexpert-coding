package main.java.com.example.firstduplicatevalue;

import java.util.Set;
import java.util.HashSet;

////Solution 1. To use Solution 1, uncomment Solution 1, and comment out Solution 2 instead.
//public class FirstDuplicateValue {
//	// O(n) time | O(n) space, where n is the length of the input array
//	public static int firstDuplicateValue(int[] array) {
//		// Create a HashSet to track the seen values.
//		Set<Integer> seen = new HashSet<>();
//
//		// Iterate through the array.
//		for (int value : array) {
//			// If the value is already in the set, return it as the first duplicate.
//			if (seen.contains(value)) {
//				return value;
//			}			
//			
//			// Add the current value to the set.
//			seen.add(value);
//		}
//		
//		// If no duplicate is found, return -1.
//		return -1;
//	}
//}

// Solution 2.
public class FirstDuplicateValue {
	// O(n) time | O(n) space, where n is the length of the input array
    public static int firstDuplicateValue(int[] array) {
        // Iterate through the array.
        for (int value : array) {
            // Get the absolute value of the current element.
            int absValue = Math.abs(value);

            // Check if the value at index (absValue - 1) is negative.
            if (array[absValue - 1] < 0) {
                return absValue; // The value is a duplicate, return it as the first duplicate.
            }

            // Mark the value at index (absValue - 1) as visited by making it negative.
            array[absValue - 1] *= -1;
        }

        // If no duplicate is found, return -1.
        return -1;
    }
}