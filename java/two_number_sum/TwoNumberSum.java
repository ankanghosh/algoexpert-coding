package main.java.com.example.twonumbersum;

import java.util.HashMap;

// O(n) time | O(n) space
public class TwoNumberSum {
    
    /**
     * Finds two numbers in the array that add up to the targetSum.
     *
     * @param array The array of integers to search within.
     * @param targetSum The target sum of the two numbers to find.
     * @return An array containing the two numbers that add up to targetSum, or an empty array if no such pair exists.
     */
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // HashMap to store numbers we've seen so far
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Iterate through each number in the array
        for (int num : array) {
            // Calculate the difference needed to reach targetSum
            int diff = targetSum - num;
            
            // Check if the difference is already in the HashMap
            if (map.containsKey(diff)) {
                // If found, return the pair of numbers that add up to targetSum
                return new int[] {num, diff};
            } else {
                // Otherwise, add the current number to the HashMap
                map.put(num, true);
            }
        }
        // Return an empty array if no pair is found
        return new int[] {};
    }
}