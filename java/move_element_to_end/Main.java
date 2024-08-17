package main.java.com.example.moveelementtoend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

// O(t * n) time | O(t) space, where t is the number of test cases and n is the length of the input array
    public static void main(String[] args) {
        // Test cases: (array, toMove) -> Expected output after moving all instances of toMove to the end
        Object[][] testCases = {
            {new Integer[]{2, 1, 2, 2, 2, 3, 4, 2}, 2},  // Test case 1: [1, 3, 4, 2, 2, 2, 2, 2]
            {new Integer[]{1, 3, 4, 5, 6, 2, 2, 2}, 2},  // Test case 2: [1, 3, 4, 5, 6, 2, 2, 2]
            {new Integer[]{2, 2, 2, 2, 2, 2}, 2},  // Test case 3: [2, 2, 2, 2, 2, 2]
            {new Integer[]{5, 1, 6, 2, 3, 2}, 2},  // Test case 4: [5, 1, 6, 3, 2, 2]
            {new Integer[]{0, 0, 1, 2, 0, 0, 3}, 0},  // Test case 5: [3, 1, 2, 0, 0, 0, 0]
            {new Integer[]{1, 2, 3, 4, 5}, 6},  // Test case 6: [1, 2, 3, 4, 5]
            {new Integer[]{6, 6, 6, 6}, 6},  // Test case 7: [6, 6, 6, 6]
            {new Integer[]{2, 1, 2, 3, 2, 4}, 3},  // Test case 8: [2, 1, 2, 4, 2, 3]
            {new Integer[]{1, 9, 2, 7, 2, 8}, 7},  // Test case 9: [1, 9, 2, 8, 2, 7]
            {new Integer[]{4, 2, 2, 4, 2, 4, 2}, 4}  // Test case 10: [2, 2, 2, 2, 4, 4, 4]
        };

        // Run and print the results of each test case
        for (int i = 0; i < testCases.length; i++) {
            Integer[] array = (Integer[]) testCases[i][0];
            int toMove = (int) testCases[i][1];

            // Convert array to a list
            List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

            // Run the method
            List<Integer> result = MoveElementToEnd.moveElementToEnd(arrayList, toMove);

            // Print the result
            System.out.println("Test case " + (i + 1) + ": " + result);
        }
    }
}