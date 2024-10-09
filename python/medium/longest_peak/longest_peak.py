# O(n) time | O(1) space, where n is the length of the input array
def longestPeak(array):
    # Keep track of the longest peak length found so far
    longestPeakLength = 0
    # Start iterating from the second element to compare with its neighbors
    i = 1

    # Loop until the second last element since the last element cannot form a peak
    while i < len(array) - 1:
        # Check if the current element forms a peak by comparing it to its neighbors
        isPeak = array[i - 1] < array[i] and array[i] > array[i + 1]

        # If it is not a peak, move to the next element and continue
        if not isPeak:
            i += 1
            continue

        # If it is a peak, expand leftwards to find the start of the strictly increasing part
        leftIdx = i - 2
        while leftIdx >= 0 and array[leftIdx] < array[leftIdx + 1]:
            leftIdx -= 1

        # Expand rightwards to find the end of the strictly decreasing part
        rightIdx = i + 2
        while rightIdx < len(array) and array[rightIdx] < array[rightIdx - 1]:
            rightIdx += 1

        # Calculate the length of the current peak
        currentPeakLength = rightIdx - leftIdx - 1

        # Update the longest peak length if the current peak is longer
        longestPeakLength = max(longestPeakLength, currentPeakLength)

        # Move `i` to the end of the current peak, as the elements after the tip will not form another one
        i = rightIdx

    # Return the length of the longest peak found
    return longestPeakLength