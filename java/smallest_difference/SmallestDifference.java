package main.java.com.example.smallestdifference;

import java.util.Arrays;

public class SmallestDifference {


	// O(n log n + m log m) time | O(1) space
	// where n is the length of arrayOne and m is the length of arrayTwo
	public static int[] getSmallestDifference(int[] arrayOne, int[] arrayTwo) {
		// Sort both arrays to allow for efficient comparison
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);

		// Initialize indices for arrayOne and arrayTwo
		int idxOne = 0;
		int idxTwo = 0;

		// Initialize variables to track the smallest difference and the current difference
		int smallestDiff = Integer.MAX_VALUE;
		int currentDiff = Integer.MAX_VALUE;

		// Initialize an array to store the pair with the smallest difference
		int[] smallestDiffPair = new int[2];

		// Iterate through both arrays until we exhaust one of them
		while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
			int firstNum = arrayOne[idxOne];
			int secondNum = arrayTwo[idxTwo];

			// If the current number in arrayOne is smaller, update the difference and move to the next number in arrayOne
			if (firstNum < secondNum) {
				currentDiff = secondNum - firstNum;
				idxOne++;
			}
			// If the current number in arrayTwo is smaller, update the difference and move to the next number in arrayTwo
			else if (secondNum < firstNum) {
				currentDiff = firstNum - secondNum;
				idxTwo++;
			}
			// If the numbers are equal, this is the smallest difference possible, so return the pair
			else {
				return new int[]{firstNum, secondNum};
			}

			// Update the smallest difference and the pair if the current difference is smaller
			if (currentDiff < smallestDiff) {
				smallestDiff = currentDiff;
				smallestDiffPair[0] = firstNum;
				smallestDiffPair[1] = secondNum;
			}
		}

		// Return the pair with the smallest difference found
		return smallestDiffPair;
	}
}