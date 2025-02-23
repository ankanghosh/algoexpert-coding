package main.java.com.example.bestseat;

public class BestSeat {
	// Function to find the best available seat in a row.
	// O(n) time | O(1) space, where n is the number of seats in a row
	public static int bestSeat(int[] seats) {
		int bestSeat = -1;  // Store the index of the best seat.
		int maxSpace = 0;   // Track the maximum available space between two occupied seats.

		int left = 0;  // Pointer to find empty seat sections.

		// Ensure there are at least 2 more seats to check,  
		// since the last seat of the row will always be occupied.
		while (left < seats.length - 2) {
			int right = left + 1;  // Move the right pointer to find the next occupied seat.
			while (right < seats.length && seats[right] == 0) {
				right++;  // Expand the empty seat section.
			}

			int availableSpace = right - left - 1;  // Number of empty seats between two occupied seats.
			if (availableSpace > maxSpace) {  // Update the best seat if a larger empty section is found.
				bestSeat = (left + right) / 2;  // Choose the middle seat for maximum space.
				maxSpace = availableSpace;  // Update the maximum space found.
			}

			left = right;  // Move the left pointer to the next occupied seat.
		}

		return bestSeat;  // Return the best seat index.
	}
}