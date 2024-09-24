# O(n) time | O(1) space, where n is the length of the array
def isMonotonic(array):
    # Initialize two boolean variables to keep track of whether the array is
    # non-increasing or non-decreasing. Start by assuming the array is both.
    isNonIncreasing = True
    isNonDecreasing = True

    # Iterate through the array from the first element to the second-to-last element.
    # Checks pairs of consecutive elements in the array.
    for i in range(len(array) - 1):
        # If the current element is greater than the next element, the array is not non-decreasing.
        if array[i+1] < array[i]:
            isNonDecreasing = False
        # If the current element is less than the next element, the array is not non-increasing.
        elif array[i+1] > array[i]:
            isNonIncreasing = False

    # Return True if the array is either non-increasing or non-decreasing.
    # If neither condition holds, return False.
    return isNonIncreasing or isNonDecreasing