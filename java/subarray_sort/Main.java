package main.java.com.example.subarraysort;

// O(t*n) time | O(t) space;
// where t is the number of test cases and n is the length of the array.
public class Main {

    public static void main(String[] args) {
        // Define test cases.
        int[][] testCases = {
            {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19},    // Test case 1: Expected: [3, 9]
            {1, 2},    // Test case 2: Expected: [-1, -1]
            {2, 1},    // Test case 3: Expected: [0, 1]
            {1, 2, 4, 7, 10, 11, 7, 12, 7, 7, 16, 18, 19},    // Test case 4: Expected: [4, 9]
            {1, 2, 4, 7, 10, 11, 7, 12, 13, 14, 16, 18, 19},    // Test case 5: Expected: [4, 6]
            {1, 2, 8, 4, 5},    // Test case 6: Expected: [2, 4]
            {4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7},    // Test case 7: Expected: [0, 12]
            {4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57},    // Test case 8: Expected: [0, 11]
            {-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57},    // Test case 9: Expected: [1, 11]
            {-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7},    // Test case 10: Expected: [1, 12]
            {1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11},    // Test case 11: Expected: [6, 7]
            {1, 2, 3, 4, 5, 6, 18, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19},    // Test case 12: Expected: [6, 16]
            {1, 2, 3, 4, 5, 6, 18, 21, 22, 7, 14, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 4, 14, 11, 6, 33, 35, 41, 55},    // Test case 13: Expected: [4, 24]
            {1, 2, 20, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19},    // Test case 14: Expected: [2, 19]
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2},    // Test case 15: Expected: [2, 19]
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},    // Test case 16: Expected: [-1, -1]
            {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89}    // Test case 17: Expected: [-1, -1]
        };

        // Run the test cases.
        for (int i = 0; i < testCases.length; i++) {
            int[] array = testCases[i];
            int[] result = SubarraySort.subarraySort(array);
            System.out.print("Test case " + (i + 1) + ": Array = [");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]);
                if (j < array.length - 1) {
                    System.out.print(", ");
                }
            }
            
            System.out.println("] -> Result: [" + result[0] + ", " + result[1] + "]");
        }
    }
}