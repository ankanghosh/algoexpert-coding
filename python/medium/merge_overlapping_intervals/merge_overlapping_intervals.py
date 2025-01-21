# Function to return the list of merged intervals by merging any overlapping intervals in an array.
# O(nlog(n)) time | O(n) space, where n is the length of the input array
def mergeOverlappingIntervals(intervals):
    # Sort the intervals based on the starting value.
    sortedIntervals = sorted(intervals, key=lambda x: x[0])

    # Initialize a list to store merged intervals.
    mergedIntervals = []

    # Initialize with the first interval.
    currentInterval = sortedIntervals[0]
    # Add the first interval to the merged list.
    mergedIntervals.append(currentInterval)

    # Start the loop from the second element (index 1).
    for nextInterval in sortedIntervals[1:]:
        # Get the end of the current interval.
        _, currentIntervalEnd = currentInterval
        # Get the start and end of the next interval.
        nextIntervalStart, nextIntervalEnd = nextInterval

        # Check if the intervals overlap.
        if currentIntervalEnd >= nextIntervalStart:
            # Merge the intervals.
            currentInterval[1] = max(currentIntervalEnd, nextIntervalEnd)
        else:
            # No overlap, update the current interval as the next interval and add it to the merged list.
            currentInterval = nextInterval
            mergedIntervals.append(currentInterval)

    # Return the merged intervals.
    return mergedIntervals