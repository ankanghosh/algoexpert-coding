# O(n) time | O(1) space, where n is the length of the input array
def moveElementToEnd(array, toMove):
    # Initialize two pointers, one at the start and one at the end of the array
    idx = 0
    lastIdx = len(array) - 1

    # Iterate through the array until the two pointers meet
    while idx < lastIdx:
        # Move the lastIdx pointer to the left if the element at lastIdx is equal to toMove
        while idx < lastIdx and array[lastIdx] == toMove:
            lastIdx -= 1

        # If the current element at idx is equal to toMove, swap it with the element at lastIdx
        if array[idx] == toMove:
            array[idx], array[lastIdx] = array[lastIdx], array[idx]

        # Move the idx pointer to the right
        idx += 1

    # Return the mutated array with all of the instances of toMove moved to the end
    return array