# Function to find the best available seat in a row.
# O(n) time | O(1) space, where n is the total number of seats in a row
def bestSeat(seats):
    bestSeat = -1  # Store the index of the best seat.
    maxSpace = 0   # Track the maximum available space between two occupied seats.

    left = 0  # Pointer to find empty seat sections.

    # Ensure there are at least 2 more seats to check,
    # since the last seat of the row will always be occupied.
    while left < len(seats) - 2:
        right = left + 1  # Move the right pointer to find the next occupied seat.
        while right < len(seats) and seats[right] == 0:
            right += 1  # Expand the empty seat section.

        availableSpace = right - left - 1  # Number of empty seats between two occupied seats.
        # Update the best seat if a larger empty section is found.
        if availableSpace > maxSpace:
            bestSeat = (left + right) // 2  # Choose the middle seat for maximum space.
            maxSpace = availableSpace  # Update the maximum space found.

        left = right  # Move the left pointer to the next occupied seat.

    return bestSeat  # Return the best seat index.