package main.java.com.example.moveelementtoend;

import java.util.List;

public class MoveElementToEnd {


	// O(n) time | O(1) space, where n is the length of the input array
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Initialize two pointers: one starting from the beginning (idx) and one from the end (lastIdx) of the array
        int idx = 0;
        int lastIdx = array.size() - 1;

        // Iterate through the list until the two pointers meet
        while (idx < lastIdx) {
            // Move the lastIdx pointer to the left if the element at lastIdx equals toMove
            while (idx < lastIdx && array.get(lastIdx) == toMove) {
                lastIdx--;
            }

            // If the element at idx equals toMove, swap it with the element at lastIdx
            if (array.get(idx) == toMove) {
                swap(idx, lastIdx, array);
            }
            // Move the idx pointer to the right
            idx++;
        }
        // Return the mutated array with all of the instances of toMove moved to the end
        return array;
    }

    // Helper method to swap the elements at indices i and j in a list
    public static void swap(int i, int j, List<Integer> array) {
        int temp = array.get(j);
        array.set(j, array.get(i));
        array.set(i, temp);
    }

}