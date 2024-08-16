# O(n) time | O(n) space, where n is the length of the input array
def sortedSquaredArray(array):
    # Initialize pointers for the smallest and largest elements in the array
    smallerIdx = 0
    largerIdx = len(array) - 1

    # Create an output array to store the sorted squares, initially filled with zeros
    sortedSquares = [0 for _ in array]

    # Iterate over the array in reverse order to fill the sortedSquares array from end to start
    for idx in reversed(range(len(array))):
        # Get the current smallest and largest values from the array
        smallerValue = array[smallerIdx]
        largerValue = array[largerIdx]

        # Compare the absolute values of the smallest and largest elements
        if abs(largerValue) < abs(smallerValue):
            # If the smaller value's square is greater, place it in the current position and move the smaller pointer right
            sortedSquares[idx] = smallerValue * smallerValue
            smallerIdx += 1
        else:
            # If the larger value's square is greater or equal, place it in the current position and move the larger pointer left
            sortedSquares[idx] = largerValue * largerValue
            largerIdx -= 1

    # Return the sorted array of squares
    return sortedSquares