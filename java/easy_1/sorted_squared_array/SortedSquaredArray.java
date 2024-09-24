package main.java.com.example.sortedsquaredarray;

public class SortedSquaredArray {


	// O(n) time | O(n) space, where n is the length of the input array
    public static int[] getSortedSquaredArray(int[] array) {
        // Initialize pointers for the smallest and largest elements in the array
        int smallerIdx = 0;
        int largerIdx = array.length - 1;

        // Create an output array to store the sorted squares
        int[] sortedSquares = new int[array.length];

        // Iterate over the array in reverse order to fill the sortedSquares array from end to start
        for (int idx = array.length - 1; idx >= 0; idx--) {
            // Get the current smallest and largest values from the array
            int smallerValue = array[smallerIdx];
            int largerValue = array[largerIdx];

            // Compare the absolute values of the smallest and largest elements
            if (Math.abs(largerValue) < Math.abs(smallerValue)) {
                // If the smaller value's square is greater, place it in the current position and move the smaller pointer right
                sortedSquares[idx] = smallerValue * smallerValue;
                smallerIdx++;
            } else {
                // If the larger value's square is greater or equal, place it in the current position and move the larger pointer left
                sortedSquares[idx] = largerValue * largerValue;
                largerIdx--;
            }
        }

        // Return the sorted array of squares
        return sortedSquares;
    }
}