package main.java.com.example.validatesubsequence;

import java.util.List;

public class Main {

	// O(t*n) time | O(t*n) space; t is the number of test cases and n is the length of the array or the sequence, whichever is greater
    public static void main(String[] args) {
        // Define test cases as a list of lists
        // Each test case consists of two lists: the array and the sequence to be checked
        List<List<Integer>> testCases = List.of(
            List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(1, 6, -1, 10),  // Test case 1: True
            List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(5, 1, 22, 22, 6, -1, 8, 10),  // Test case 2: False
            List.of(1, 2, 3, 4, 5), List.of(2, 4),  // Test case 3: True
            List.of(1, 2, 3, 4, 5), List.of(2, 5, 3),  // Test case 4: False
            List.of(1, 2, 3, 4, 5), List.of(1, 2, 3, 4, 5),  // Test case 5: True
            List.of(1, 2, 3, 4, 5), List.of(0),  // Test case 6: False
            List.of(1, 2, 3, 4, 5), List.of(),  // Test case 7: True
            List.of(), List.of(1),  // Test case 8: False
            List.of(1, 2, 3, 4, 5), List.of(5, 4, 3, 2, 1),  // Test case 9: False
            List.of(10, 20, 30, 40, 50), List.of(20, 40)  // Test case 10: True
        );

        // Iterate through test cases and print results
        // Test cases are stored in pairs of lists, so increment index by 2 each iteration
        for (int i = 0; i < testCases.size(); i += 2) {
            List<Integer> array = testCases.get(i);       // Retrieve the array for the current test case
            List<Integer> sequence = testCases.get(i + 1); // Retrieve the sequence for the current test case
            boolean result = ValidateSubsequence.isValidSubsequence(array, sequence);
            System.out.println("Test case " + (i / 2 + 1) + ": " + result); // Print the result with test case number
        }
    }
}