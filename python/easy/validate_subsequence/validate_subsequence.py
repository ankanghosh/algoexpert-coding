# O(n) time | O(1) space; n is the length of the array or the sequence, whichever is greater
def isValidSubsequence(array, sequence):
    # Initialize indices for the array and the sequence
    arrIdx = 0
    seqIdx = 0

    # Iterate through the array until we either exhaust the array or find the entire sequence
    while arrIdx < len(array) and seqIdx < len(sequence):
        # Check if the current element in the array matches the current element in the sequence
        if array[arrIdx] == sequence[seqIdx]:
            # Move to the next element in the sequence
            seqIdx += 1
        # Move to the next element in the array
        arrIdx += 1

    # Return True if we have matched all elements in the sequence, otherwise return False
    return seqIdx == len(sequence)