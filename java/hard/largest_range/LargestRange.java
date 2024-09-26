package main.java.com.example.largestrange;

import java.util.HashMap;
import java.util.Map;

public class LargestRange {
	// O(n) time | O(n) space, where n is the number of elements in the array
    public static int[] largestRange(int[] array) {
        // Initialize variables to store the best range and the length of the longest range found so far
        int[] bestRange = new int[2];
        int longestLength = 0;

        // Create a HashMap to keep track of the numbers that have been visited
        Map<Integer, Boolean> nums = new HashMap<>();

        // Populate the HashMap, setting all numbers to true, indicating they have not been visited yet
        for (int num : array) {
            nums.put(num, true);
        }

        // Iterate through each number in the array
        for (int num : array) {
            // If the number has already been visited, skip it
            if (!nums.get(num)) {
                continue;
            }

            // Mark the number as visited
            nums.put(num, false);
            // Initialize the length of the current range to 1 (the current number itself)
            int currentLength = 1;
            // Set up pointers to check numbers to the left and right of the current number
            int left = num - 1;
            int right = num + 1;

            // Expand the range to the left
            while (nums.containsKey(left)) {
                // Mark the left number as visited
                nums.put(left, false);
                // Increase the length of the current range
                currentLength++;
                // Move the left pointer further left
                left--;
            }

            // Expand the range to the right
            while (nums.containsKey(right)) {
                // Mark the right number as visited
                nums.put(right, false);
                // Increase the length of the current range
                currentLength++;
                // Move the right pointer further right
                right++;
            }

            // If the current range is longer than the longest range found so far, update the best range
            if (currentLength > longestLength) {
                longestLength = currentLength;
                // Store the range as [left + 1, right - 1], since left and right are one step beyond the actual range
                bestRange[0] = left + 1;
                bestRange[1] = right - 1;
            }
        }

        // Return the best (largest) range found
        return bestRange;
    }
}