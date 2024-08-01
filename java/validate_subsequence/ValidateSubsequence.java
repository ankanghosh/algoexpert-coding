package main.java.com.example.validatesubsequence;

import java.util.List;

public class ValidateSubsequence {

    /**
     * Determines if the given sequence is a valid subsequence of the given array.
     * A sequence is considered a valid subsequence if all elements of the sequence appear in the array
     * in the same order, but not necessarily consecutively.
     *
     * @param array    The list of integers representing the array.
     * @param sequence The list of integers representing the sequence to be checked.
     * @return true if the sequence is a valid subsequence of the array, false otherwise.
     * 
     */
	// O(n) time | O(1) space; n is the length of the array or the sequence, whichever is greater
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0; // Index to traverse the array
        int seqIdx = 0; // Index to traverse the sequence
        
        // Loop through the array and sequence
        while (arrIdx < array.size() && seqIdx < sequence.size()) {            
            // If current elements match, move to the next element in the sequence
            if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
                seqIdx++;
            }
            // Always move to the next element in the array
            arrIdx++;
        }
        // If seqIdx has reached the end of the sequence, it means the entire sequence was found
        return seqIdx == sequence.size();
    }   
}